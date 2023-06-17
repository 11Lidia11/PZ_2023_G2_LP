package database_classes;

import javafx.scene.control.Button;

/**
 * Klasa reprezentująca tabelę "Users" z bazy danych
 */
public class UsersTable {

    /**
     * @param idLoginUser Statyczne ID
     */
    private static int idLoginUser;
    /**
     * @param idEditUser Statyczny numer ID do edycji
     */
    private static int idEditUser;
    /**
     * @param groupNumber Statyczny numer grupy
     */
    private static int groupNumber;
    /**
     * @param loginName Statyczne imię
     */
    private static String loginName;
    /**
     * @param loginSurname Statyczne nazwisko
     */
    private static String loginSurname;
    /**
     * @param idUser ID
     */
    private int idUser;
    /**
     * @param name Imię
     */
    private String name;
    /**
     * @param surname Nazwisko
     */
    private String surname;
    /**
     * @param address Adres
     */
    private String address;
    /**
     * @param zip Kod pocztowy
     */
    private String zip;
    /**
     * @param place Miejscowość
     */
    private String place;
    /**
     * @param phoneNumberNumer telefonu
     */
    private int phoneNumber;
    /**
     * @param email Email
     */
    private String email;
    /**
     * @param password Hasło
     */
    private String password;
    /**
     * @param positionId ID Stanowiska
     */
    private int positionId;
    /**
     * @param login Login
     */
    private int login;
    /**
     * @param groups Grupa
     */
    private int groups;
    /**
     * @param namePosition Nazwa stanowiska
     */
    private String namePosition;
    /**
     * @param token Token
     */
    private String token;
    /**
     * @param editEmployeeButton Przycisk do edycji pracownika
     */
    private Button editEmployeeButton;

    public UsersTable() {}

    public UsersTable(int idUser, String name, String surname, String address, String zip, String place, int phoneNumber, int positionId, String token, int groups){
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.zip = zip;
        this.place = place;
        this.phoneNumber = phoneNumber;
        this.positionId = positionId;
        this.token = token;
        this.groups = groups;
        this.editEmployeeButton = new Button();
    }

    public static int getIdEditUser() {
        return idEditUser;
    }

    public static void setIdEditUser(int idEditUser) {
        UsersTable.idEditUser = idEditUser;
    }

    public static int getIdLoginUser() {
        return idLoginUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getZip() {
        return zip;
    }

    public String getPlace() {
        return place;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getPositionId() {
        return positionId;
    }

    public int getLogin() {
        return login;
    }

    public int getGroups() {
        return groups;
    }

    public static String getLoginName() {
        return loginName;
    }

    public static String getLoginSurname() {
        return loginSurname;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public String getToken() {
        return token;
    }

    public Button getEditEmployeeButton() {
        return editEmployeeButton;
    }

    public static void setIdLoginUser(int idLoginUser) {
        UsersTable.idLoginUser = idLoginUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public void setGroups(int groups) {
        this.groups = groups;
    }

    public static void setLoginName(String loginName) {
        UsersTable.loginName = loginName;
    }

    public static void setLoginSurname(String loginSurname) {
        UsersTable.loginSurname = loginSurname;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setEditEmployeeButton(Button editEmployeeButton) {
        this.editEmployeeButton = editEmployeeButton;
    }

    public static int getGroupNumber() {
        return groupNumber;
    }

    public static void setGroupNumber(int groupNumber) {
        UsersTable.groupNumber = groupNumber;
    }
}

