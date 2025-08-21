package a4;

import De.C3106c;
import Ee.O;
import android.text.TextUtils;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.regex.Pattern;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5659b {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f45083d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    private static final O<String> f45084e = O.z(CameraSettings.FOCUS_STRATEGY_AUTO, "none");

    /* renamed from: f, reason: collision with root package name */
    private static final O<String> f45085f = O.B("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final O<String> f45086g = O.z("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    private static final O<String> f45087h = O.B("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f45088a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45089b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45090c;

    public static C5659b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = C3106c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(O.t(TextUtils.split(strE, f45083d)));
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
    private static a4.C5659b b(Ee.O<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C5659b.b(Ee.O):a4.b");
    }

    private C5659b(int i10, int i11, int i12) {
        this.f45088a = i10;
        this.f45089b = i11;
        this.f45090c = i12;
    }
}
