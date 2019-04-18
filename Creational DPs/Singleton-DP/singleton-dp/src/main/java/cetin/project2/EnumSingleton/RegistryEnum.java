package cetin.project2.EnumSingleton;

/**
 * Introduced by Joshua Bloch, Google 2k8
 * no worry for inheritance
 * no worry for object creation
 * no worry for serialization and deserialization
**/
 public enum RegistryEnum {
    INSTANCE;

    int value;

    public int getValue() { return  value; }
    public void setValue(int value) { this.value = value; }
}
