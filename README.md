# Intégration Spring & Hibernate

![Spring](https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=flat&logo=hibernate&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)
![Licence](https://img.shields.io/badge/License-MIT-green)

---

## 📖 Plan

[📝 Objectif](#-objectif)  
[📚 Contexte](#-contexte)  
[🏗 Structure du projet](#-structure-du-projet)  
[💻 Explication des classes](#-explication-des-classes)  
[⚙️ Configuration et exécution](#-configuration-et-exécution)  
[📊 Résultats et interprétation](#-résultats-et-interprétation)  
[💡 Concepts clés](#-concepts-clés)  


---

## 📝 Objectif

Ce TP permet de :  
- Comprendre la gestion des dépendances avec Maven.  
- Configurer Spring pour l’injection de dépendances et la gestion des transactions.  
- Intégrer Hibernate pour la persistance d’entités Java.  
- Créer un DAO pour gérer les opérations CRUD sur les entités.  
- Configurer une base de données MySQL et interagir avec les entités persistantes.  

---

## 📚 Contexte

Spring permet de gérer l’injection de dépendances et les transactions. Hibernate assure la persistance des objets Java dans une base relationnelle.  
Dans ce TP :  
- **Product** : entité JPA représentant un produit avec `id`, `name`, et `price`.  
- **DAO** : interface générique CRUD et implémentation transactionnelle avec Spring & Hibernate.  
- **Spring** : gère les beans et les transactions.  
- **Hibernate** : gère les sessions et le mapping des entités vers MySQL.  

---

## 🏗 Structure du projet

<img width="821" height="407" alt="LAB 5 JEE SC1" src="https://github.com/user-attachments/assets/a72f2655-5c14-47ff-9594-6211ee3a626a" />


---

## 💻 Explication des classes

### 1️⃣ Entité Product
- `@Entity` : indique qu’il s’agit d’une entité persistante.  
- `@Id` et `@GeneratedValue` : identifiant auto-incrémenté.  
- Champs : `name` (String) et `price` (double).  

### 2️⃣ Interface DAO
- `IDao<T>` : définit les méthodes CRUD communes :  
  `create(T o)`, `delete(T o)`, `update(T o)`, `findById(int id)`, `findAll()`.  

### 3️⃣ Implémentation DAO
- `ProductDaoImpl` :  
  - `@Repository` : interaction avec la base.  
  - `@Transactional` : transactions gérées automatiquement.  
  - `sessionFactory.getCurrentSession()` : récupère la session Hibernate active pour exécuter CRUD.  

### 4️⃣ Configuration Spring/Hibernate
- `HibernateConfig` :  
  - `@Configuration`, `@ComponentScan`, `@EnableTransactionManagement`.  
  - Bean `DataSource` : config MySQL.  
  - Bean `LocalSessionFactoryBean` : crée SessionFactory.  
  - Bean `HibernateTransactionManager` : gère les transactions.  
- Lit les propriétés dans `application.properties` pour URL, user, mot de passe, dialect, etc.  

### 5️⃣ Test & Présentation
- `TestHibernate` : vérifie la création correcte de SessionFactory et TransactionManager.  
- `Presentation2` : crée un produit, le persiste et affiche un message de succès.  

---
## 📊 Résultats et interprétation


<img width="821" height="407" alt="LAB 5 JEE SC1" src="https://github.com/user-attachments/assets/fde6745c-9722-4d19-9b4f-8a2dc7387c30" />

## 💡 Concepts clés

Spring IoC et injection de dépendances.

Gestion des transactions avec @Transactional.

Hibernate ORM et mapping JPA.

SessionFactory et Session Hibernate.

DAO transactionnel avec Spring + Hibernate.



<img width="835" height="320" alt="LAB5 JEE SC2" src="https://github.com/user-attachments/assets/5f215f93-c7a8-4962-8f60-341d457c42e0" />



<img width="722" height="430" alt="LAB5 JEE SC3" src="https://github.com/user-attachments/assets/a9e6e867-cb64-4ffa-9238-63e7b07e62f9" />

