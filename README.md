# 🤖 AI Response Evaluation Tool

A simple AI-powered tool to generate, compare, and evaluate multiple responses for a given prompt. Built using Spring Boot with a minimal HTML frontend.

---

## 🚀 Features

- Accepts user input prompts  
- Generates two responses (Response A & Response B)  
- Displays responses side-by-side for comparison  
- Allows evaluation based on:
  - Accuracy  
  - Relevance  
  - Clarity  

---

## 🛠 Tech Stack

- Java (Spring Boot)  
- REST API  
- HTML, CSS, JavaScript  

---

## 📌 API Endpoint

### POST `/api/evaluate`

**Request:**
```json
{
  "prompt": "Explain Artificial Intelligence"
}

Response:
{
  "responseA": "This is Response A for: Explain Artificial Intelligence",
  "responseB": "This is Response B for: Explain Artificial Intelligence"
}

▶️ How to Run
1)Clone the repository:
      git clone https://github.com/harshinchurkar10/llm-response-evaluation-tool.git

2)Navigate to the project:
       cd spring-boot-h2-database-crud

3)Run the application:
        mvnw.cmd spring-boot:run

4)Open in browser:
       http://localhost:8080/index.html

📈 Future Enhancements
- Integrate real LLM APIs (OpenAI, etc.)
- Store evaluation results in a database
- Improve UI/UX design
- Add user authentication

💡 About

This project demonstrates a basic workflow for evaluating AI-generated responses. It is designed to be simple, extendable, and suitable for learning or further development into a full-scale LLM evaluation platform.


---

# ✅ After this

Run:
```bash
git add README.md
git commit -m "Updated professional README"
git push
 
