package zg;

import Fd.C3299a7;
import Fd.C3364g0;
import Fd.C3478p7;
import Fd.C3534u9;
import Fd.C3556w9;
import Fd.C9;
import Fd.EnumC3419k7;
import Fd.EnumC3431l7;
import Fd.EnumC3523t9;
import Fd.M9;
import Fd.N9;
import Fd.Q9;
import Fd.X6;
import Fd.Y6;
import Fd.Z6;
import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ug.C17411i;
import wg.C17872b;

/* renamed from: zg.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C18483b {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray f172749a;

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray f172750b;

    /* renamed from: c, reason: collision with root package name */
    static final AtomicReference f172751c;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    private static final Map f172752d;

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static {
        SparseArray sparseArray = new SparseArray();
        f172749a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f172750b = sparseArray2;
        f172751c = new AtomicReference();
        sparseArray.put(-1, EnumC3419k7.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC3419k7.FORMAT_CODE_128);
        sparseArray.put(2, EnumC3419k7.FORMAT_CODE_39);
        sparseArray.put(4, EnumC3419k7.FORMAT_CODE_93);
        sparseArray.put(8, EnumC3419k7.FORMAT_CODABAR);
        sparseArray.put(16, EnumC3419k7.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC3419k7.FORMAT_EAN_13);
        sparseArray.put(64, EnumC3419k7.FORMAT_EAN_8);
        sparseArray.put(128, EnumC3419k7.FORMAT_ITF);
        sparseArray.put(256, EnumC3419k7.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC3419k7.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC3419k7.FORMAT_UPC_E);
        sparseArray.put(RecyclerView.m.FLAG_MOVED, EnumC3419k7.FORMAT_PDF417);
        sparseArray.put(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, EnumC3419k7.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC3431l7.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC3431l7.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC3431l7.TYPE_EMAIL);
        sparseArray2.put(3, EnumC3431l7.TYPE_ISBN);
        sparseArray2.put(4, EnumC3431l7.TYPE_PHONE);
        sparseArray2.put(5, EnumC3431l7.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC3431l7.TYPE_SMS);
        sparseArray2.put(7, EnumC3431l7.TYPE_TEXT);
        sparseArray2.put(8, EnumC3431l7.TYPE_URL);
        sparseArray2.put(9, EnumC3431l7.TYPE_WIFI);
        sparseArray2.put(10, EnumC3431l7.TYPE_GEO);
        sparseArray2.put(11, EnumC3431l7.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC3431l7.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f172752d = map;
        map.put(1, EnumC3523t9.CODE_128);
        map.put(2, EnumC3523t9.CODE_39);
        map.put(4, EnumC3523t9.CODE_93);
        map.put(8, EnumC3523t9.CODABAR);
        map.put(16, EnumC3523t9.DATA_MATRIX);
        map.put(32, EnumC3523t9.EAN_13);
        map.put(64, EnumC3523t9.EAN_8);
        map.put(128, EnumC3523t9.ITF);
        map.put(256, EnumC3523t9.QR_CODE);
        map.put(512, EnumC3523t9.UPC_A);
        map.put(1024, EnumC3523t9.UPC_E);
        map.put(Integer.valueOf(RecyclerView.m.FLAG_MOVED), EnumC3523t9.PDF417);
        map.put(Integer.valueOf(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT), EnumC3523t9.AZTEC);
    }

    public static EnumC3419k7 a(int i10) {
        EnumC3419k7 enumC3419k7 = (EnumC3419k7) f172749a.get(i10);
        return enumC3419k7 == null ? EnumC3419k7.FORMAT_UNKNOWN : enumC3419k7;
    }

    public static EnumC3431l7 b(int i10) {
        EnumC3431l7 enumC3431l7 = (EnumC3431l7) f172750b.get(i10);
        return enumC3431l7 == null ? EnumC3431l7.TYPE_UNKNOWN : enumC3431l7;
    }

    static void e(N9 n92, final Y6 y62) {
        n92.f(new M9() { // from class: zg.a
            @Override // Fd.M9
            public final C9 zza() {
                C3299a7 c3299a7 = new C3299a7();
                X6 x62 = C18483b.f() ? X6.TYPE_THICK : X6.TYPE_THIN;
                Y6 y63 = y62;
                c3299a7.e(x62);
                C3478p7 c3478p7 = new C3478p7();
                c3478p7.b(y63);
                c3299a7.h(c3478p7.c());
                return Q9.d(c3299a7);
            }
        }, Z6.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean f() {
        AtomicReference atomicReference = f172751c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zB = n.b(C17411i.c().b());
        atomicReference.set(Boolean.valueOf(zB));
        return zB;
    }

    public static C3556w9 c(C17872b c17872b) {
        int iA = c17872b.a();
        C3364g0 c3364g0 = new C3364g0();
        if (iA == 0) {
            c3364g0.f(f172752d.values());
        } else {
            for (Map.Entry entry : f172752d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iA) != 0) {
                    c3364g0.e((EnumC3523t9) entry.getValue());
                }
            }
        }
        C3534u9 c3534u9 = new C3534u9();
        c3534u9.b(c3364g0.g());
        return c3534u9.c();
    }
}
