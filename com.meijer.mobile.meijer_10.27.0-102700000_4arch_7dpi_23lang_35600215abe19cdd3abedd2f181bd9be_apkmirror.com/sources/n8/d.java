package n8;

import B2.InterfaceC2943h;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroid/content/Context;", "LB2/h;", "LF2/f;", "b", "Lkotlin/properties/ReadOnlyProperty;", "a", "(Landroid/content/Context;)LB2/h;", "dataStore", "agent.core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f151102a = {Reflection.j(new PropertyReference1Impl(d.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b, reason: collision with root package name */
    private static final ReadOnlyProperty f151103b = E2.a.b("dynatrace-legacy-preferences", null, null, null, 14, null);

    public static final InterfaceC2943h<F2.f> a(Context context) {
        Intrinsics.j(context, "<this>");
        return (InterfaceC2943h) f151103b.getValue(context, f151102a[0]);
    }
}
