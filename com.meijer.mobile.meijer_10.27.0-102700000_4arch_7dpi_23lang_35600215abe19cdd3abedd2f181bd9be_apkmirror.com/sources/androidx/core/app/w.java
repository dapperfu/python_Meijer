package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final String f53845a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f53846b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence[] f53847c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f53848d;

    /* renamed from: e, reason: collision with root package name */
    private final int f53849e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f53850f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<String> f53851g;

    static class a {
        public static RemoteInput a(w wVar) {
            Set<String> setD;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(wVar.i()).setLabel(wVar.h()).setChoices(wVar.e()).setAllowFreeFormInput(wVar.c()).addExtras(wVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (setD = wVar.d()) != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(builderAddExtras, wVar.f());
            }
            return builderAddExtras.build();
        }
    }

    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    static RemoteInput[] b(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            remoteInputArr[i10] = a(wVarArr[i10]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f53848d;
    }

    public Set<String> d() {
        return this.f53851g;
    }

    public CharSequence[] e() {
        return this.f53847c;
    }

    public int f() {
        return this.f53849e;
    }

    public Bundle g() {
        return this.f53850f;
    }

    public CharSequence h() {
        return this.f53846b;
    }

    public String i() {
        return this.f53845a;
    }

    static RemoteInput a(w wVar) {
        return a.a(wVar);
    }

    public boolean j() {
        if (!c()) {
            if ((e() == null || e().length == 0) && d() != null && !d().isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
