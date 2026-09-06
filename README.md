<<<<<<< HEAD
# Mindustry-HypnoAndCrawlersMod
Mindustry Mod adding new crawler types -Nuclear, Ice, and Electric - and a new turret with a hypnotic-effect bullet.
=======
How to Build and Test the Mod

To build and test the mod locally:

Download or clone this repository.
Make sure the mod is located outside the main Mindustry project directory.
Navigate to the mod directory:
cd HypnoMod
On Linux, you may need to fix the gradlew line endings and permissions:
sed -i 's/\r$//' gradlew
chmod +x gradlew
Build the mod:
./gradlew build

This will compile the mod and generate a .jar file in:

build/libs/
Open Mindustry and import the generated .jar file through Settings → Mods → Import Mod to test the mod.
Running the Mod During Development

To run Mindustry with the mod during development, use:

./gradlew :desktop:run

Note: Run ./gradlew build from the mod's directory, not from the main Mindustry project directory.
