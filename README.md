# 💱 Currency Exchange Microservice

A Spring Boot microservice to fetch live currency exchange rates using the Frankfurter API. It allows converting a base currency (like USD) to multiple target currencies in real time.

---

## ✅ Features

- Fetch exchange rate from USD to any single currency
- Fetch exchange rates from any base currency to all supported currencies
- Clean architecture: Controller → API Connector → HTTP Connector
- Jackson-based JSON parsing
- Ready for future DB integration and scheduled tasks

---

## 📦 Tech Stack

- Java 17+
- Spring Boot
- RestTemplate
- Jackson
- H2 Database (optional)
- IntelliJ IDEA

---
src/
├── controller/          → REST endpoints
├── utils/               → HTTP connector + Api Connector
├── dto/                 → Data models (if needed)
├── constants/           → Currency name mappings

🙌 Author
Made with patience and pressure by
Rahul Budhiraja ✨
GitHub: RahulBudhiraja25

