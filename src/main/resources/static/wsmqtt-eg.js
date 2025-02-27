client = new Paho.MQTT.Client("localhost", 61614, "BrowserClientId");
client.onConnectionLost = onConnectionLost;

client.onMessageArrived = onMessageArrived;
client.connect(
    {onSuccess:onConnect, onFailure: onConnectionFailed}
);

function onConnect() {
  // Once a connection has been made, make a subscription and send a message.
  console.log("onConnect");
  client.subscribe("home/thermostats/101/hall");
};


function onConnectionFailed(responseObject) {
  if (responseObject.errorCode !== 0)
	console.log("onConnectionFailed:"+responseObject.errorMessage);
};

function onConnectionLost(responseObject) {
  if (responseObject.errorCode !== 0)
	console.log("onConnectionLost:"+responseObject.errorMessage);
};
function onMessageArrived(message) {
  console.log("onMessageArrived:"+message.payloadString);
  let telemetry = JSON.parse(message.payloadString);
   console.log("Telemetry: " + telemetry.location 
               + ", " + telemetry.temperature
               + ", " + new Date(telemetry.date)
              );
};
