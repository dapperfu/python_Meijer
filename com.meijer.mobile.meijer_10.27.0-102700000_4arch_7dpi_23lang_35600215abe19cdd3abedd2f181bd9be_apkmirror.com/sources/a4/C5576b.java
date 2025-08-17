package a4;

import Be.C2957c;
import Ce.O;
import android.text.TextUtils;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.regex.Pattern;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5576b {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f44265d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    private static final O<String> f44266e = O.z(CameraSettings.FOCUS_STRATEGY_AUTO, "none");

    /* renamed from: f, reason: collision with root package name */
    private static final O<String> f44267f = O.B("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final O<String> f44268g = O.z("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    private static final O<String> f44269h = O.B("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f44270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44271b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44272c;

    public static C5576b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = C2957c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(O.t(TextUtils.split(strE, f44265d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static a4.C5576b b(Ce.O<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C5576b.b(Ce.O):a4.b");
    }

    private C5576b(int i10, int i11, int i12) {
        this.f44270a = i10;
        this.f44271b = i11;
        this.f44272c = i12;
    }
}
