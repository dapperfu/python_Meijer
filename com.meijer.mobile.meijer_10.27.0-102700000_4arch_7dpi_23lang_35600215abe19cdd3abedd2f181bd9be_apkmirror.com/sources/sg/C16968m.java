package sg;

import Cd.AbstractC2988f;
import Cd.AbstractC2991i;
import Cd.C2990h;
import Td.C5235m;
import Td.InterfaceC5228f;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fullstory.FS;
import com.google.android.gms.dynamite.DynamiteModule;
import gd.C14244c;
import gd.C14248g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import md.C15596b;
import md.C15597c;
import md.C15600f;

/* renamed from: sg.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16968m {

    /* renamed from: A, reason: collision with root package name */
    private static final AbstractC2991i f160476A;

    /* renamed from: B, reason: collision with root package name */
    private static final AbstractC2991i f160477B;

    /* renamed from: a, reason: collision with root package name */
    public static final C14244c[] f160478a = new C14244c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final C14244c f160479b;

    /* renamed from: c, reason: collision with root package name */
    public static final C14244c f160480c;

    /* renamed from: d, reason: collision with root package name */
    public static final C14244c f160481d;

    /* renamed from: e, reason: collision with root package name */
    public static final C14244c f160482e;

    /* renamed from: f, reason: collision with root package name */
    public static final C14244c f160483f;

    /* renamed from: g, reason: collision with root package name */
    public static final C14244c f160484g;

    /* renamed from: h, reason: collision with root package name */
    public static final C14244c f160485h;

    /* renamed from: i, reason: collision with root package name */
    public static final C14244c f160486i;

    /* renamed from: j, reason: collision with root package name */
    public static final C14244c f160487j;

    /* renamed from: k, reason: collision with root package name */
    public static final C14244c f160488k;

    /* renamed from: l, reason: collision with root package name */
    public static final C14244c f160489l;

    /* renamed from: m, reason: collision with root package name */
    public static final C14244c f160490m;

    /* renamed from: n, reason: collision with root package name */
    public static final C14244c f160491n;

    /* renamed from: o, reason: collision with root package name */
    public static final C14244c f160492o;

    /* renamed from: p, reason: collision with root package name */
    public static final C14244c f160493p;

    /* renamed from: q, reason: collision with root package name */
    public static final C14244c f160494q;

    /* renamed from: r, reason: collision with root package name */
    public static final C14244c f160495r;

    /* renamed from: s, reason: collision with root package name */
    public static final C14244c f160496s;

    /* renamed from: t, reason: collision with root package name */
    public static final C14244c f160497t;

    /* renamed from: u, reason: collision with root package name */
    public static final C14244c f160498u;

    /* renamed from: v, reason: collision with root package name */
    public static final C14244c f160499v;

    /* renamed from: w, reason: collision with root package name */
    public static final C14244c f160500w;

    /* renamed from: x, reason: collision with root package name */
    public static final C14244c f160501x;

    /* renamed from: y, reason: collision with root package name */
    public static final C14244c f160502y;

    /* renamed from: z, reason: collision with root package name */
    public static final C14244c f160503z;

    static {
        C14244c c14244c = new C14244c("vision.barcode", 1L);
        f160479b = c14244c;
        C14244c c14244c2 = new C14244c("vision.custom.ica", 1L);
        f160480c = c14244c2;
        C14244c c14244c3 = new C14244c("vision.face", 1L);
        f160481d = c14244c3;
        C14244c c14244c4 = new C14244c("vision.ica", 1L);
        f160482e = c14244c4;
        C14244c c14244c5 = new C14244c("vision.ocr", 1L);
        f160483f = c14244c5;
        f160484g = new C14244c("mlkit.ocr.chinese", 1L);
        f160485h = new C14244c("mlkit.ocr.common", 1L);
        f160486i = new C14244c("mlkit.ocr.devanagari", 1L);
        f160487j = new C14244c("mlkit.ocr.japanese", 1L);
        f160488k = new C14244c("mlkit.ocr.korean", 1L);
        C14244c c14244c6 = new C14244c("mlkit.langid", 1L);
        f160489l = c14244c6;
        C14244c c14244c7 = new C14244c("mlkit.nlclassifier", 1L);
        f160490m = c14244c7;
        C14244c c14244c8 = new C14244c("tflite_dynamite", 1L);
        f160491n = c14244c8;
        C14244c c14244c9 = new C14244c("mlkit.barcode.ui", 1L);
        f160492o = c14244c9;
        C14244c c14244c10 = new C14244c("mlkit.smartreply", 1L);
        f160493p = c14244c10;
        f160494q = new C14244c("mlkit.image.caption", 1L);
        f160495r = new C14244c("mlkit.docscan.detect", 1L);
        f160496s = new C14244c("mlkit.docscan.crop", 1L);
        f160497t = new C14244c("mlkit.docscan.enhance", 1L);
        f160498u = new C14244c("mlkit.docscan.ui", 1L);
        f160499v = new C14244c("mlkit.docscan.stain", 1L);
        f160500w = new C14244c("mlkit.docscan.shadow", 1L);
        f160501x = new C14244c("mlkit.quality.aesthetic", 1L);
        f160502y = new C14244c("mlkit.quality.technical", 1L);
        f160503z = new C14244c("mlkit.segmentation.subject", 1L);
        C2990h c2990h = new C2990h();
        c2990h.a("barcode", c14244c);
        c2990h.a("custom_ica", c14244c2);
        c2990h.a("face", c14244c3);
        c2990h.a("ica", c14244c4);
        c2990h.a("ocr", c14244c5);
        c2990h.a("langid", c14244c6);
        c2990h.a("nlclassifier", c14244c7);
        c2990h.a("tflite_dynamite", c14244c8);
        c2990h.a("barcode_ui", c14244c9);
        c2990h.a("smart_reply", c14244c10);
        f160476A = c2990h.b();
        C2990h c2990h2 = new C2990h();
        c2990h2.a("com.google.android.gms.vision.barcode", c14244c);
        c2990h2.a("com.google.android.gms.vision.custom.ica", c14244c2);
        c2990h2.a("com.google.android.gms.vision.face", c14244c3);
        c2990h2.a("com.google.android.gms.vision.ica", c14244c4);
        c2990h2.a("com.google.android.gms.vision.ocr", c14244c5);
        c2990h2.a("com.google.android.gms.mlkit.langid", c14244c6);
        c2990h2.a("com.google.android.gms.mlkit.nlclassifier", c14244c7);
        c2990h2.a("com.google.android.gms.tflite_dynamite", c14244c8);
        c2990h2.a("com.google.android.gms.mlkit_smartreply", c14244c10);
        f160477B = c2990h2.b();
    }

    public static boolean b(Context context, final C14244c[] c14244cArr) {
        try {
            return ((C15596b) C5235m.a(C15597c.a(context).n(new com.google.android.gms.common.api.f() { // from class: sg.D
                @Override // com.google.android.gms.common.api.f
                public final C14244c[] a() {
                    C14244c[] c14244cArr2 = C16968m.f160478a;
                    return c14244cArr;
                }
            }).e(new InterfaceC5228f() { // from class: sg.E
                @Override // Td.InterfaceC5228f
                public final void onFailure(Exception exc) {
                    FS.log_e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).B();
        } catch (InterruptedException | ExecutionException e10) {
            FS.log_e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    @Deprecated
    public static boolean a(Context context, List<String> list) throws Throwable {
        if (C14248g.f().a(context) >= 221500000) {
            return b(context, f(f160477B, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.e(context, DynamiteModule.f64996b, it.next());
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    @Deprecated
    public static void c(Context context, String str) {
        d(context, AbstractC2988f.m(str));
    }

    @Deprecated
    public static void d(Context context, List<String> list) {
        if (C14248g.f().a(context) >= 221500000) {
            e(context, f(f160476A, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, final C14244c[] c14244cArr) {
        C15597c.a(context).c(C15600f.d().a(new com.google.android.gms.common.api.f() { // from class: sg.B
            @Override // com.google.android.gms.common.api.f
            public final C14244c[] a() {
                C14244c[] c14244cArr2 = C16968m.f160478a;
                return c14244cArr;
            }
        }).b()).e(new InterfaceC5228f() { // from class: sg.C
            @Override // Td.InterfaceC5228f
            public final void onFailure(Exception exc) {
                FS.log_e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static C14244c[] f(Map map, List list) {
        C14244c[] c14244cArr = new C14244c[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            c14244cArr[i10] = (C14244c) com.google.android.gms.common.internal.r.l((C14244c) map.get(list.get(i10)));
        }
        return c14244cArr;
    }
}
