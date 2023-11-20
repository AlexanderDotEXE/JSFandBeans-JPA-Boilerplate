package tests;

import entity.UserEntity;

import javax.persistence.*;

public class TestJPA {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            UserEntity user = new UserEntity();
            user.setNutzerId(6);
            user.setVorname("Dalia");
            user.setNachName("Abo Sheasha");
            user.setPasswort("!");
            entityManager.persist(user);

            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
