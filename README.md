# Java-Music-Album-info

The program presents the User with a console- based menu to interact with the data set. The menu loops until the User enters a character to exit the menu (e.g., zero as illustrated below). In addition to an exit option, the menu offers three other options: 
- List all albums
- Select a single album to view
- Search in song titles.

<p align="center"><img width="252" alt="Screenshot 2022-11-16 at 19 38 18" src="https://user-images.githubusercontent.com/93152488/202277780-5d1753b6-2628-42c0-beb1-70569040a9ed.png"></p>

Within the ‘albums’ data file, there are 20 entries that each represent a single album. On the first line of each album entry there are six data fields
representing the following information (in order): 
- The current sales ranking
- The title of the album
- The name of the artist 
- The year the album was released
- The total number of sales to date (‘M’ denotes million and ‘K’ denotes thousand)

The first line is then followed by the list of song tracks for the album (one per line, in the original published order), with each track indicating the duration of the song (minutes:seconds) in braces. Each album entry is separated by a dashed line in the text file.

You are required to implement a Java class to represent an album. The program should parse the data file, create an object for each album, and store all 
the objects into a suitable collection. Figure below provides a partial UML class representation of the class that you will need to implement. It indicates 
required data members and accessor (i.e., getter) methods that map to those data members, and a toString() method. It is left to you to determine class
data types and how the Album objects should be initialised.

<p align="center"><img width="375" alt="Screenshot 2022-11-16 at 19 25 27" src="https://user-images.githubusercontent.com/93152488/202275218-3d5fbb02-73b7-4de7-9ea8-a9780fdf6d0f.png"></p>
