# melee-mover

## What is Melee Mover?

Ever had the issue of losing your Super Smash Bros. Melee for the Nintendo GameCube disc that you pay hard cash for? Well luckily, we can emulate it. But the ISO maybe be hard to find. Hence this tool allows your friends to send you it directly over the internet.

## Instructions

### Sender

1. Place your melee iso in the same folder as Server.class
2. Rename your iso to melee.iso
3. Port-forward port 55555 to your local IP address if connected via a router.
4. Open the program folder in the command line and type java Server.

### Receiver

1. Make sure the Sender has completed all of his steps.
2. Open the program folder in the command line and type java Client 123.456.789.10, but replace the numbers with the Sender's IP.

The file will proceed to be transferred over the internet, at a speed that depends on the minimum between the sender's upload speed and the receiver's download speed. This is usually bottlenecked heavily by the sender's upload speed.

## Legal Notes

Please only use this program if both you and your friend have purchased legitimate copies of Super Smash Bros. Melee for the Nintendo GameCube.
