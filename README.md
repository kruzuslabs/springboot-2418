# Springboot project

Basic stuff

### Task Endpoints:

1. **Create Task:**
   - Endpoint: `POST /api/tasks`
   - Description: Create a new task.
   - Request Body: Task details (e.g., title, description, due date).
   - Response: Task details along with an identifier.

2. **Edit Task:**
   - Endpoint: `PUT /api/tasks/{taskId}`
   - Description: Update an existing task.
   - Request Body: Updated task details.
   - Path Variable: taskId (unique identifier for the task).
   - Response: Updated task details.

3. **View Task:**
   - Endpoint: `GET /api/tasks/{taskId}`
   - Description: Retrieve details of a specific task.
   - Path Variable: taskId (unique identifier for the task).
   - Response: Task details.

4. **Search Tasks:**
   - Endpoint: `GET /api/tasks`
   - Description: Search tasks based on parameters (e.g., title, status, due date).
   - Query Parameters: Allow filtering tasks based on various criteria.
   - Response: List of tasks matching the search criteria.

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

8. **User Tasks:**
   - Endpoint: `GET /api/users/{userId}/tasks`
   - Description: Retrieve the list of tasks associated with a specific user.
   - Path Variable: userId (unique identifier for the user).
   - Response: List of tasks for the specified user.
