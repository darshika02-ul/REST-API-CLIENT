# REST-API-CLIENT
*COMPANY*: CODTECH IT SOLUTIONS
*NAME*: DARSHIKA R
*INTERN ID*: CT08TXH 
*DOMAIN*: JAVA PROGRAMMING 
*DURATION*: 4 WEEKS 
*MENTOR*: NEELA SANTOSH

##TASK 1: WRITE A JAVA APPLICATION THAT CONSUMES A PUBLIC REST API (E.G., FETCHING WEATHER DATA) AND DISPLAYS THE DATA IN A STRUCTURED FORMAT.
Developing a Java application that consumes a public REST API is an essential skill for modern software development, enabling applications to fetch real-time data from external sources. In this example, we create a Java program that makes an HTTP request to a REST API, retrieves JSON data, and displays it in a structured format. The application demonstrates the use of Java’s HttpURLConnection class for network communication and the org.json library for JSON parsing.
The process begins with defining a public API endpoint. In this case, we use a placeholder API (https://jsonplaceholder.typicode.com/todos/1), which provides a sample JSON response. However, this can be easily modified to fetch weather data from OpenWeatherMap or other public APIs. The program starts by making an HTTP GET request to the specified URL using HttpURLConnection. When the request is sent, the server responds with a JSON payload containing relevant information. To read this response, the program uses a BufferedReader to process the incoming stream of data and store it in a StringBuilder. If the HTTP response code is not 200 OK, an exception is thrown, ensuring proper error handling.
Once the JSON data is retrieved, it is passed to the parseJsonResponse method, where the org.json library helps extract key fields from the JSON response. The application extracts values such as id, title, and completed status and prints them to the console in a structured format. This makes it easier for users to interpret the data. For instance, if the API is fetching weather data, this step could be modified to extract temperature, humidity, and weather conditions, providing meaningful insights to the user.
This implementation ensures modularity by separating concerns into different methods. The sendHttpRequest method is responsible for handling the API request and response retrieval, while the parseJsonResponse method focuses on data extraction and presentation. This separation enhances code readability and maintainability. Additionally, the program includes exception handling to manage potential errors, such as network failures or unexpected response formats.
By modifying the API endpoint, this program can be extended to interact with real-world APIs, such as fetching current weather conditions, stock market data, or news headlines. Developers can also integrate this approach into larger applications, such as mobile apps or enterprise systems, to automate data retrieval and processing. Furthermore, using libraries like Gson or Jackson can enhance JSON parsing efficiency, especially when dealing with complex responses.
In conclusion, this Java application effectively demonstrates how to consume a public REST API, process the JSON response, and present the data in a structured format. By leveraging HttpURLConnection and JSON parsing techniques, developers can integrate real-time data into their applications, enhancing functionality and user experience. This project serves as a foundation for building more advanced API-driven applications, where live data plays a critical role in decision-making and automation.

##TASK 2 DELIVERABLE: A JAVA PROGRAM THAT HANDLES HTTP REQUESTS AND PARSES JSON RESPONSES.
A Java program that handles HTTP requests and parses JSON responses is a fundamental component of modern application development, enabling real-time data retrieval from web services. This program demonstrates how to make an HTTP request, retrieve JSON data from an API, and parse the response into meaningful information. The core functionality revolves around Java’s HttpURLConnection class for network communication and the org.json library for JSON parsing.
The program begins by defining a public API endpoint (https://jsonplaceholder.typicode.com/todos/1), which provides a sample JSON response. This endpoint can be easily modified to consume data from real-world APIs such as weather services, stock market feeds, or news aggregators. The application consists of a main method that orchestrates the HTTP request and JSON parsing. The sendHttpRequest method is responsible for establishing an HTTP connection, sending a GET request, and handling the server response. It first constructs a URL object and opens a connection using HttpURLConnection. The request method is set to GET, ensuring that data is retrieved without modifying the server’s state.
Once the connection is established, the program checks the HTTP response code to ensure successful communication with the server. If the response code is not 200 OK, an exception is thrown to indicate an error. The response body is then read using a BufferedReader, which efficiently processes the incoming data stream line by line. This data is accumulated in a StringBuilder, forming a complete JSON response string. The method returns this JSON string to be further processed.
The parseJsonResponse method takes the JSON response string and uses the org.json library to parse it. The JSON object is constructed, and relevant fields such as id, title, and completed status are extracted. These values are printed to the console in a structured format, ensuring easy readability. If the API were fetching weather data, this step would be modified to extract temperature, humidity, and weather conditions.
The implementation follows a modular approach, separating concerns into distinct methods for network communication and data processing. This design improves code maintainability and readability, allowing developers to modify specific parts without affecting the entire application. Additionally, exception handling is implemented to manage potential errors, such as network failures or malformed JSON responses.
This program can be extended in several ways. Developers can integrate APIs like OpenWeatherMap to fetch real-time weather updates, use NASA’s public APIs for space-related data, or retrieve stock market prices from financial APIs. Enhancements may include allowing user input for dynamic API requests, storing retrieved data in a database, or displaying the data in a graphical user interface (GUI) rather than the console. Furthermore, using external libraries such as Gson or Jackson can enhance JSON parsing efficiency, especially for handling complex or nested data structures.
In conclusion, this Java application efficiently handles HTTP requests and processes JSON responses, making it a robust foundation for real-time data retrieval and processing. By leveraging Java’s networking capabilities and JSON parsing techniques, developers can build powerful applications that interact with web services, enhancing functionality and user experience in modern software solutions.















