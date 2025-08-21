package Z7;

import B2.InterfaceC2911h;
import F2.f;
import F2.g;
import Y7.d;
import Y7.e;
import a8.C5668b;
import a8.InterfaceC5667a;
import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.room.C6278w;
import b8.C6337a;
import b8.C6339c;
import b8.InterfaceC6338b;
import b8.h;
import b8.i;
import com.dynatrace.agent.storage.db.OneAgentDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR%\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'¨\u0006)"}, d2 = {"LZ7/b;", "", "Landroid/content/Context;", "context", "Lmv/O;", "externalScope", "<init>", "(Landroid/content/Context;Lmv/O;)V", "LY7/d;", "e", "()LY7/d;", "Lb8/h;", "h", "()Lb8/h;", "Lb8/b;", "i", "()Lb8/b;", "La8/a;", "d", "()La8/a;", "Lb8/a;", "f", "()Lb8/a;", "Lb8/g;", "g", "()Lb8/g;", "", "j", "()V", "a", "Landroid/content/Context;", "LB2/h;", "LF2/f;", "b", "Lkotlin/properties/ReadOnlyProperty;", "c", "(Landroid/content/Context;)LB2/h;", "dataStore", "Lcom/dynatrace/agent/storage/db/OneAgentDatabase;", "Lcom/dynatrace/agent/storage/db/OneAgentDatabase;", "db", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f43640d = {Reflection.k(new PropertyReference2Impl(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReadOnlyProperty dataStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final OneAgentDatabase db;

    public b(Context context, InterfaceC15783O externalScope) {
        Intrinsics.j(context, "context");
        Intrinsics.j(externalScope, "externalScope");
        this.context = context;
        this.dataStore = E2.a.b("dynatrace-preferences", new C2.b(new Function1() { // from class: Z7.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.b((CorruptionException) obj);
            }
        }), null, externalScope, 4, null);
        this.db = (OneAgentDatabase) C6278w.a(context, OneAgentDatabase.class, "dynatrace-database").d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f b(CorruptionException it) {
        Intrinsics.j(it, "it");
        return g.a();
    }

    private final InterfaceC2911h<f> c(Context context) {
        return (InterfaceC2911h) this.dataStore.getValue(context, f43640d[0]);
    }

    public final InterfaceC5667a d() {
        return new C5668b();
    }

    public final d e() {
        return new e(this.db.g());
    }

    public final C6337a f() {
        return new C6337a(c(this.context));
    }

    public final b8.g g() {
        return new b8.g(new b8.f(c(this.context)));
    }

    public final h h() {
        return new i(c(this.context));
    }

    public final InterfaceC6338b i() {
        return new C6339c(c(this.context));
    }

    public final void j() {
        z8.f.a("dtxStorage", "close DB connection");
        this.db.close();
    }
}
