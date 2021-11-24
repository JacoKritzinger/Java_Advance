package section_9;

public class MainTelephone {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(12415122);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }
}

