# Springboot project

Remake of my other project, "Ticket Manager". 

### Ticket Endpoints:

1. **Create Ticket:**
   - Endpoint: `POST /api/tickets`
   - Description: Create a new tickets.
   - Request Body: tickets details (e.g., title, description, due date).
   - Response: tickets details along with an identifier.

2. **Edit Ticket:**
   - Endpoint: `PUT /api/tickets/{ticketId}`
   - Description: Update an existing tickets.
   - Request Body: Updated tickets details.
   - Path Variable: ticketId (unique identifier for the tickets).
   - Response: Updated tickets details.

3. **View Ticket:**
   - Endpoint: `GET /api/tickets/{ticketId}`
   - Description: Retrieve details of a specific tickets.
   - Path Variable: ticketId (unique identifier for the tickets).
   - Response: tickets details.

4. **Search Ticket:**
   - Endpoint: `GET /api/tickets`
   - Description: tickets based on parameters (e.g., title, status, due date).
   - Query Parameters: Allow filtering tickets based on various criteria.
   - Response: List of tickets matching the search criteria.

### User Endpoints:

5. **Create User:**
   - Endpoint: `POST /api/users`
   - Description: Create a new user.
   - Request Body: User details (e.g., username, email, password).
   - Response: User details along with an identifier.

6. **View User:**
   - Endpoint: `GET /api/users/{userId}`
   - Description: Retrieve details of a specific user.
   - Path Variable: userId (unique identifier for the user).
   - Response: User details.

7. **Edit User:**
   - Endpoint: `PUT /api/users/{userId}`
   - Description: Update user details.
   - Request Body: Updated user details.
   - Path Variable: userId (unique identifier for the user).
   - Response: Updated user details.

8. **User Tickets:**
   - Endpoint: `GET /api/users/{userId}/tickets`
   - Description: Retrieve the list of tickets associated with a specific user.
   - Path Variable: userId (unique identifier for the user).
   - Response: List of tickets for the specified user.
