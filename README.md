# Data Storage (ROOM)
Room provides an abstraction layer over SQLite to allow fluent database access while harnessing the
full power of SQLite.

There are 3 major components in ROOM:
1. Database: Contains the database holder and serves as the main access point for the underlying
connection to our app's persisted, relational data. At runtime, you can acquire an instance of 
Database by calling Room.databaseBuilder() or Room.inMemoryDatabaseBuilder()
2. Entity: Represents a table within the database.
3. DAO: Contains the methods used for accessing the database.

