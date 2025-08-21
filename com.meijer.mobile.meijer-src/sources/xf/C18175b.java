package xf;

import Vd.AbstractC5516j;
import android.content.Context;
import java.nio.charset.Charset;
import qf.C;
import qf.P;
import rc.C16883c;
import rc.InterfaceC16888h;
import rc.InterfaceC16890j;
import tc.u;
import tf.AbstractC17251F;
import uf.j;

/* renamed from: xf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C18175b {

    /* renamed from: c, reason: collision with root package name */
    private static final j f170722c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final String f170723d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    private static final String f170724e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC16888h<AbstractC17251F, byte[]> f170725f = new InterfaceC16888h() { // from class: xf.a
        @Override // rc.InterfaceC16888h
        public final Object apply(Object obj) {
            return C18175b.f170722c.M((AbstractC17251F) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C18178e f170726a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16888h<AbstractC17251F, byte[]> f170727b;

    public AbstractC5516j<C> c(C c10, boolean z10) {
        return this.f170726a.i(c10, z10).a();
    }

    C18175b(C18178e c18178e, InterfaceC16888h<AbstractC17251F, byte[]> interfaceC16888h) {
        this.f170726a = c18178e;
        this.f170727b = interfaceC16888h;
    }

    public static C18175b b(Context context, yf.j jVar, P p10) {
        u.f(context);
        InterfaceC16890j interfaceC16890jH = u.c().h(new com.google.android.datatransport.cct.a(f170723d, f170724e));
        C16883c c16883cB = C16883c.b("json");
        InterfaceC16888h<AbstractC17251F, byte[]> interfaceC16888h = f170725f;
        return new C18175b(new C18178e(interfaceC16890jH.a("FIREBASE_CRASHLYTICS_REPORT", AbstractC17251F.class, c16883cB, interfaceC16888h), jVar.b(), p10), interfaceC16888h);
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
