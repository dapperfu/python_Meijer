package vf;

import Td.AbstractC5232j;
import android.content.Context;
import java.nio.charset.Charset;
import of.C;
import of.P;
import pc.C16279c;
import pc.InterfaceC16284h;
import pc.InterfaceC16286j;
import rc.u;
import rf.AbstractC16777F;
import sf.j;

/* renamed from: vf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C17563b {

    /* renamed from: c, reason: collision with root package name */
    private static final j f164686c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final String f164687d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    private static final String f164688e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC16284h<AbstractC16777F, byte[]> f164689f = new InterfaceC16284h() { // from class: vf.a
        @Override // pc.InterfaceC16284h
        public final Object apply(Object obj) {
            return C17563b.f164686c.M((AbstractC16777F) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C17566e f164690a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16284h<AbstractC16777F, byte[]> f164691b;

    public AbstractC5232j<C> c(C c10, boolean z10) {
        return this.f164690a.i(c10, z10).a();
    }

    C17563b(C17566e c17566e, InterfaceC16284h<AbstractC16777F, byte[]> interfaceC16284h) {
        this.f164690a = c17566e;
        this.f164691b = interfaceC16284h;
    }

    public static C17563b b(Context context, wf.j jVar, P p10) {
        u.f(context);
        InterfaceC16286j interfaceC16286jH = u.c().h(new com.google.android.datatransport.cct.a(f164687d, f164688e));
        C16279c c16279cB = C16279c.b("json");
        InterfaceC16284h<AbstractC16777F, byte[]> interfaceC16284h = f164689f;
        return new C17563b(new C17566e(interfaceC16286jH.a("FIREBASE_CRASHLYTICS_REPORT", AbstractC16777F.class, c16279cB, interfaceC16284h), jVar.b(), p10), interfaceC16284h);
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
