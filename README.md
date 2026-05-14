# eBank AI Microservices

Une architecture microservices moderne pour une plateforme bancaire IA, construite avec Spring Boot et Spring Cloud.

## 📋 Description

**eBank AI Microservices** est une solution d'architecture microservices complète pour un système bancaire intégrant l'intelligence artificielle. Le projet utilise les technologies Spring Cloud pour gérer la découverte de services, la configuration centralisée et la communication inter-services.

## 🎯 Objectifs

- Fournir une architecture évolutive pour les services bancaires
- Intégrer des capacités d'IA pour améliorer l'expérience utilisateur
- Assurer une communication fiable entre les microservices
- Faciliter le déploiement et la scalabilité des services

## 🏗️ Architecture

### Structure du Projet

```
ebank-ai-microservices/
├── parent pom.xml (orchestration Maven)
└── customer-service/          # Service de gestion des clients
    ├── pom.xml
    └── src/
```

### Services

#### Customer Service
- **Localisation**: `customer-service/`
- **Port**: À configurer dans `application.properties`
- **Java Version**: 21
- **Technologies**:
  - Spring Boot 3.5.14
  - Spring Cloud 2025.0.2
  - Spring Data JPA
  - H2 Database (développement)
  - Netflix Eureka (découverte de services)

## 🛠️ Technologies Utilisées

### Stack Technique

| Composant | Version | Utilité |
|-----------|---------|---------|
| **Java** | 17+ | Langage principal |
| **Spring Boot** | 3.5.14 | Framework d'application |
| **Spring Cloud** | 2025.0.2 | Architecture microservices |
| **Spring Data JPA** | - | ORM et persistance |
| **Netflix Eureka** | - | Service discovery |
| **H2 Database** | - | Base de données (dev) |
| **Lombok** | - | Réduction du boilerplate |
| **Maven** | - | Gestion des dépendances |

### Dépendances Principales

- **spring-boot-starter-actuator**: Monitoring et métriques
- **spring-boot-starter-data-jpa**: Accès aux données
- **spring-boot-starter-web**: API REST
- **spring-cloud-starter-config**: Configuration centralisée
- **spring-cloud-starter-netflix-eureka-client**: Service discovery
- **lombok**: Annotations pour réduire le code
- **h2**: Base de données embarquée

## 🚀 Démarrage Rapide

### Prérequis

- **Java 21** ou supérieur
- **Maven 3.6+**
- **Git**

### Installation

1. **Cloner le repository**
   ```bash
   git clone https://github.com/kossouboly/ebank-ai-microservices.git
   cd ebank-ai-microservices
   ```

2. **Construire le projet**
   ```bash
   mvn clean install
   ```

3. **Exécuter le Customer Service**
   ```bash
   cd customer-service
   mvn spring-boot:run
   ```

   Le service démarre par défaut sur `http://localhost:8080`

### Endpoints Disponibles

#### Health Check
```bash
curl http://localhost:8080/actuator/health
```

#### Service Discovery (Eureka)
Vérifier l'enregistrement du service:
```bash
curl http://localhost:8761/  # Eureka Dashboard (si configuré)
```

## 📦 Modules

### parent pom.xml
- Orchestration Maven pour tous les modules
- Gestion centralisée des versions
- Java 17 par défaut

### customer-service
- Gestion des clients/profils utilisateurs
- Persistance avec JPA
- Intégration Eureka pour service discovery
- Actuator pour le monitoring

## 🔧 Configuration

### Variables d'Environnement

```properties
# application.properties
server.port=8080
spring.application.name=customer-service
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
```

### Développement

1. Copier/créer `application.properties` dans `customer-service/src/main/resources/`
2. Configurer les ports et la base de données
3. Démarrer le service

## 🧪 Tests

```bash
# Exécuter tous les tests
mvn test

# Exécuter les tests d'un module spécifique
cd customer-service
mvn test
```

## 📊 Monitoring

Avec **Spring Boot Actuator** activé, les endpoints de monitoring sont disponibles:

```bash
# Métriques
curl http://localhost:8080/actuator/metrics

# Health check détaillé
curl http://localhost:8080/actuator/health

# Info de l'application
curl http://localhost:8080/actuator/info
```

## 🔄 Communication Inter-Services

Les services sont découverts via **Netflix Eureka** et communiquent via REST ou messages.

### Configuration Eureka Client

```properties
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
spring.application.name=customer-service
```

## 📚 Documentation Supplémentaire

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Cloud Documentation](https://spring.io/projects/spring-cloud)
- [Netflix Eureka](https://github.com/Netflix/eureka)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

## 🤝 Contribution

1. Fork le repository
2. Créer une branche (`git checkout -b feature/AmazingFeature`)
3. Commiter vos changements (`git commit -m 'Add some AmazingFeature'`)
4. Push vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrir une Pull Request

## 📝 License

Ce projet est distribué sous la License MIT. Voir le fichier `LICENSE` pour plus de détails.

## 👤 Auteur

**kossouboly**  
- GitHub: [@kossouboly](https://github.com/kossouboly)

## 📞 Support

Pour toute question ou problème, veuillez:
- Ouvrir une [Issue GitHub](https://github.com/kossouboly/ebank-ai-microservices/issues)
- Consulter la [Documentation Spring](https://spring.io)

## 🗓️ Dernière Mise à Jour

14 mai 2026

---

**Note**: Ce projet est en phase de développement. Les contributions et retours sont les bienvenus! 🚀
