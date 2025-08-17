package sg;

import android.content.Context;
import android.content.SharedPreferences;
import bf.C6245c;
import bf.InterfaceC6246d;
import java.util.UUID;

/* renamed from: sg.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16969n {

    /* renamed from: b, reason: collision with root package name */
    public static final C6245c<?> f160504b = C6245c.e(C16969n.class).b(bf.q.l(C16964i.class)).b(bf.q.l(Context.class)).f(new bf.g() { // from class: sg.F
        @Override // bf.g
        public final Object a(InterfaceC6246d interfaceC6246d) {
            return new C16969n((Context) interfaceC6246d.a(Context.class));
        }
    }).d();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f160505a;

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    protected final SharedPreferences b() {
        return this.f160505a.getSharedPreferences("com.google.mlkit.internal", 0);
    }

    public C16969n(Context context) {
        this.f160505a = context;
    }
}
