package xg;

import Dd.C3077a7;
import Dd.C3142g0;
import Dd.C3256p7;
import Dd.C3312u9;
import Dd.C3334w9;
import Dd.C9;
import Dd.EnumC3197k7;
import Dd.EnumC3209l7;
import Dd.EnumC3301t9;
import Dd.M9;
import Dd.N9;
import Dd.Q9;
import Dd.X6;
import Dd.Y6;
import Dd.Z6;
import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import sg.C16964i;
import ug.C17255b;

/* renamed from: xg.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18046b {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray f169600a;

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray f169601b;

    /* renamed from: c, reason: collision with root package name */
    static final AtomicReference f169602c;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    private static final Map f169603d;

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static {
        SparseArray sparseArray = new SparseArray();
        f169600a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f169601b = sparseArray2;
        f169602c = new AtomicReference();
        sparseArray.put(-1, EnumC3197k7.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC3197k7.FORMAT_CODE_128);
        sparseArray.put(2, EnumC3197k7.FORMAT_CODE_39);
        sparseArray.put(4, EnumC3197k7.FORMAT_CODE_93);
        sparseArray.put(8, EnumC3197k7.FORMAT_CODABAR);
        sparseArray.put(16, EnumC3197k7.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC3197k7.FORMAT_EAN_13);
        sparseArray.put(64, EnumC3197k7.FORMAT_EAN_8);
        sparseArray.put(128, EnumC3197k7.FORMAT_ITF);
        sparseArray.put(256, EnumC3197k7.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC3197k7.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC3197k7.FORMAT_UPC_E);
        sparseArray.put(RecyclerView.m.FLAG_MOVED, EnumC3197k7.FORMAT_PDF417);
        sparseArray.put(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, EnumC3197k7.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC3209l7.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC3209l7.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC3209l7.TYPE_EMAIL);
        sparseArray2.put(3, EnumC3209l7.TYPE_ISBN);
        sparseArray2.put(4, EnumC3209l7.TYPE_PHONE);
        sparseArray2.put(5, EnumC3209l7.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC3209l7.TYPE_SMS);
        sparseArray2.put(7, EnumC3209l7.TYPE_TEXT);
        sparseArray2.put(8, EnumC3209l7.TYPE_URL);
        sparseArray2.put(9, EnumC3209l7.TYPE_WIFI);
        sparseArray2.put(10, EnumC3209l7.TYPE_GEO);
        sparseArray2.put(11, EnumC3209l7.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC3209l7.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f169603d = map;
        map.put(1, EnumC3301t9.CODE_128);
        map.put(2, EnumC3301t9.CODE_39);
        map.put(4, EnumC3301t9.CODE_93);
        map.put(8, EnumC3301t9.CODABAR);
        map.put(16, EnumC3301t9.DATA_MATRIX);
        map.put(32, EnumC3301t9.EAN_13);
        map.put(64, EnumC3301t9.EAN_8);
        map.put(128, EnumC3301t9.ITF);
        map.put(256, EnumC3301t9.QR_CODE);
        map.put(512, EnumC3301t9.UPC_A);
        map.put(1024, EnumC3301t9.UPC_E);
        map.put(Integer.valueOf(RecyclerView.m.FLAG_MOVED), EnumC3301t9.PDF417);
        map.put(Integer.valueOf(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT), EnumC3301t9.AZTEC);
    }

    public static EnumC3197k7 a(int i10) {
        EnumC3197k7 enumC3197k7 = (EnumC3197k7) f169600a.get(i10);
        return enumC3197k7 == null ? EnumC3197k7.FORMAT_UNKNOWN : enumC3197k7;
    }

    public static EnumC3209l7 b(int i10) {
        EnumC3209l7 enumC3209l7 = (EnumC3209l7) f169601b.get(i10);
        return enumC3209l7 == null ? EnumC3209l7.TYPE_UNKNOWN : enumC3209l7;
    }

    static void e(N9 n92, final Y6 y62) {
        n92.f(new M9() { // from class: xg.a
            @Override // Dd.M9
            public final C9 zza() {
                C3077a7 c3077a7 = new C3077a7();
                X6 x62 = C18046b.f() ? X6.TYPE_THICK : X6.TYPE_THIN;
                Y6 y63 = y62;
                c3077a7.e(x62);
                C3256p7 c3256p7 = new C3256p7();
                c3256p7.b(y63);
                c3077a7.h(c3256p7.c());
                return Q9.d(c3077a7);
            }
        }, Z6.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean f() {
        AtomicReference atomicReference = f169602c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zB = n.b(C16964i.c().b());
        atomicReference.set(Boolean.valueOf(zB));
        return zB;
    }

    public static C3334w9 c(C17255b c17255b) {
        int iA = c17255b.a();
        C3142g0 c3142g0 = new C3142g0();
        if (iA == 0) {
            c3142g0.f(f169603d.values());
        } else {
            for (Map.Entry entry : f169603d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iA) != 0) {
                    c3142g0.e((EnumC3301t9) entry.getValue());
                }
            }
        }
        C3312u9 c3312u9 = new C3312u9();
        c3312u9.b(c3142g0.g());
        return c3312u9.c();
    }
}
