package qq;

import B2.InterfaceC2943h;
import F2.f;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "LB2/h;", "LF2/f;", "b", "Lkotlin/properties/ReadOnlyProperty;", "(Landroid/content/Context;)LB2/h;", "dataStore", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: qq.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16599c {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f157520a = {Reflection.j(new PropertyReference1Impl(C16599c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b, reason: collision with root package name */
    private static final ReadOnlyProperty f157521b = E2.a.b("application_manager_data_store", null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2943h<f> b(Context context) {
        return (InterfaceC2943h) f157521b.getValue(context, f157520a[0]);
    }
}
