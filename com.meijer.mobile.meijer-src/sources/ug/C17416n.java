package ug;

import android.content.Context;
import android.content.SharedPreferences;
import df.C13676c;
import df.InterfaceC13677d;
import java.util.UUID;

/* renamed from: ug.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17416n {

    /* renamed from: b, reason: collision with root package name */
    public static final C13676c<?> f163990b = C13676c.e(C17416n.class).b(df.q.l(C17411i.class)).b(df.q.l(Context.class)).f(new df.g() { // from class: ug.F
        @Override // df.g
        public final Object a(InterfaceC13677d interfaceC13677d) {
            return new C17416n((Context) interfaceC13677d.a(Context.class));
        }
    }).d();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f163991a;

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
        return this.f163991a.getSharedPreferences("com.google.mlkit.internal", 0);
    }

    public C17416n(Context context) {
        this.f163991a = context;
    }
}
