package Fd;

/* renamed from: Fd.l7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC3431l7 implements O0 {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);


    /* renamed from: a, reason: collision with root package name */
    private final int f10199a;

    @Override // Fd.O0
    public final int zza() {
        return this.f10199a;
    }

    EnumC3431l7(int i10) {
        this.f10199a = i10;
    }
}
