package q5;

import android.os.Build;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\b"}, d2 = {"Lq5/s;", "logger", "Lq5/o;", "a", "(Lq5/s;)Lq5/o;", "", "Z", "IS_DEVICE_BLOCKED", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: q5.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16454f {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f156779a;

    static {
        String str;
        int i10 = Build.VERSION.SDK_INT;
        boolean zY = false;
        if (i10 == 26) {
            String str2 = Build.MODEL;
            if (str2 != null) {
                if (StringsKt.W(StringsKt.J0(str2, "SAMSUNG-"), "SM-", false, 2, null)) {
                    zY = true;
                } else {
                    String str3 = Build.DEVICE;
                    if (str3 != null) {
                        zY = ArraysKt.Y(new String[]{"nora", "nora_8917", "nora_8917_n", "james", "rjames_f", "rjames_go", "pettyl", "hannah", "ahannah", "rhannah", "ali", "ali_n", "aljeter", "aljeter_n", "jeter", "evert", "evert_n", "evert_nt", "G3112", "G3116", "G3121", "G3123", "G3125", "G3412", "G3416", "G3421", "G3423", "G3426", "G3212", "G3221", "G3223", "G3226", "BV6800Pro", "CatS41", "Hi9Pro", "manning", "N5702L"}, str3);
                    }
                }
            }
        } else if (i10 == 27 && (str = Build.DEVICE) != null) {
            zY = ArraysKt.Y(new String[]{"mcv1s", "mcv3", "mcv5a", "mcv7a", "A30ATMO", "A70AXLTMO", "A3A_8_4G_TMO", "Edison_CKT", "EDISON_TF", "FERMI_TF", "U50A_ATT", "U50A_PLUS_ATT", "U50A_PLUS_TF", "U50APLUSTMO", "U5A_PLUS_4G", "RCT6513W87DK5e", "RCT6873W42BMF9A", "RCT6A03W13", "RCT6B03W12", "RCT6B03W13", "RCT6T06E13", "A3_Pro", "One", "One_Max", "One_Pro", "Z2", "Z2_PRO", "Armor_3", "Armor_6", "Blackview", "BV9500", "BV9500Pro", "A6L-C", "N5002LA", "N5501LA", "Power_2_Pro", "Power_5", "Z9", "V0310WW", "V0330WW", "A3", "ASUS_X018_4", "C210AE", "fireball", "ILA_X1", "Infinix-X605_sprout", "j7maxlte", "KING_KONG_3", "M10500", "S70", "S80Lite", "SGINO6", "st18c10bnn", "TECNO-CA8", "SHIFT6m"}, str);
        }
        f156779a = zY;
    }

    public static final InterfaceC16463o a(InterfaceC16467s interfaceC16467s) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || f156779a) ? new C16465q(false) : (i10 == 26 || i10 == 27) ? new C16466r(interfaceC16467s) : new C16465q(true);
    }
}
