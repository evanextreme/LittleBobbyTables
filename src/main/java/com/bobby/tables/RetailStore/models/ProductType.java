package com.bobby.tables.RetailStore.models;

/**
 * Model class for ProductType table
 */
public class ProductType {

    /** Default constructor */
    public ProductType() {}

    /** Alternate constructor with fields */
    public ProductType(int id, String type, int parentTypeId) {
        this.id = id;
        this.type = type;
        this.parentTypeId = parentTypeId;
    }

    /** Alternate constructor with fields */
    public ProductType(String type, int parentTypeId) {
        this.type = type;
        this.parentTypeId = parentTypeId;
    }

    /** Alternate constructor with fields */
    public ProductType(String type) {
        this.type = type;
    }

    /** Alternate constructor with fields */
    public ProductType(int id, String type) {
        this.id = id;
        this.type = type;
    }

    /**
     * Prints out all info for debugging application
     * Assumes debugging record from database (so all required fields
     * like id are present)
     */
    public void debug() {
        System.out.println("ProductType #" + id);
        System.out.println(">\tType: " + type);
        System.out.println(">\tParent Type: " + parentTypeId);
    }

    // Private fields

    private int id;

    private String type;

    private int parentTypeId;

    // Getter and setters for private fields


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(int parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
}
