package X7;

import B2.InterfaceC2943h;
import F2.f;
import W7.d;
import W7.e;
import Y7.b;
import Z7.c;
import Z7.g;
import Z7.h;
import Z7.i;
import android.content.Context;
import androidx.room.C6136w;
import com.dynatrace.agent.storage.db.OneAgentDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR%\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\u001d\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%¨\u0006'"}, d2 = {"LX7/a;", "", "Landroid/content/Context;", "context", "Lqv/O;", "externalScope", "<init>", "(Landroid/content/Context;Lqv/O;)V", "LW7/d;", "c", "()LW7/d;", "LZ7/h;", "f", "()LZ7/h;", "LZ7/b;", "g", "()LZ7/b;", "LY7/a;", "b", "()LY7/a;", "LZ7/a;", "d", "()LZ7/a;", "LZ7/g;", "e", "()LZ7/g;", "", "h", "()V", "a", "Landroid/content/Context;", "LB2/h;", "LF2/f;", "Lkotlin/properties/ReadOnlyProperty;", "(Landroid/content/Context;)LB2/h;", "dataStore", "Lcom/dynatrace/agent/storage/db/OneAgentDatabase;", "Lcom/dynatrace/agent/storage/db/OneAgentDatabase;", "db", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f39162d = {Reflection.k(new PropertyReference2Impl(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReadOnlyProperty dataStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final OneAgentDatabase db;

    public a(Context context, InterfaceC16622O externalScope) {
        Intrinsics.j(context, "context");
        Intrinsics.j(externalScope, "externalScope");
        this.context = context;
        this.dataStore = E2.a.b("dynatrace-preferences", null, null, externalScope, 6, null);
        this.db = (OneAgentDatabase) C6136w.a(context, OneAgentDatabase.class, "dynatrace-database").d();
    }

    private final InterfaceC2943h<f> a(Context context) {
        return (InterfaceC2943h) this.dataStore.getValue(context, f39162d[0]);
    }

    public final Y7.a b() {
        return new b();
    }

    public final d c() {
        return new e(this.db.g());
    }

    public final Z7.a d() {
        return new Z7.a(a(this.context));
    }

    public final g e() {
        return new g(new Z7.f(a(this.context)));
    }

    public final h f() {
        return new i(a(this.context));
    }

    public final Z7.b g() {
        return new c(a(this.context));
    }

    public final void h() {
        x8.f.a("dtxStorage", "close DB connection");
        this.db.close();
    }
}
