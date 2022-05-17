package com.karasusoft.arenafitnessapi.enums;

public enum UserStatus {

    CREATED("Criado",1),
    ACTIVATED("Ativo",2),
    DEACTIVATED("Desativado",3),
    PAYMENT_UP_TO_DATE("Pagamento em Dia",4),
    DELAYED_PAYMENT("Pagamento Atrasado",5);

    private final String description;
    private int value;

    UserStatus(String desc, int value){
        this.description = desc;
        this.value = value;
    }

    public String getDescription() {
        return this.description;
    }

    public int getvalue() {
        return this.value;
    }
}
