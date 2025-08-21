package kotlin.reflect.jvm.internal.impl.incremental;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* loaded from: classes14.dex */
public final class UtilsKt {
    public static final void a(LookupTracker lookupTracker, LookupLocation from, ClassDescriptor scopeOwner, Name name) {
        LocationInfo location;
        Intrinsics.j(lookupTracker, "<this>");
        Intrinsics.j(from, "from");
        Intrinsics.j(scopeOwner, "scopeOwner");
        Intrinsics.j(name, "name");
        if (lookupTracker == LookupTracker.DO_NOTHING.f145021a || (location = from.getLocation()) == null) {
            return;
        }
        Position position = lookupTracker.a() ? location.getPosition() : Position.f145047c.a();
        String strA = location.a();
        String strA2 = DescriptorUtils.m(scopeOwner).a();
        ScopeKind scopeKind = ScopeKind.f145052b;
        String strB = name.b();
        Intrinsics.i(strB, "asString(...)");
        lookupTracker.b(strA, position, strA2, scopeKind, strB);
    }

    public static final void b(LookupTracker lookupTracker, LookupLocation from, PackageFragmentDescriptor scopeOwner, Name name) {
        Intrinsics.j(lookupTracker, "<this>");
        Intrinsics.j(from, "from");
        Intrinsics.j(scopeOwner, "scopeOwner");
        Intrinsics.j(name, "name");
        String strA = scopeOwner.e().a();
        String strB = name.b();
        Intrinsics.i(strB, "asString(...)");
        c(lookupTracker, from, strA, strB);
    }

    public static final void c(LookupTracker lookupTracker, LookupLocation from, String packageFqName, String name) {
        LocationInfo location;
        Intrinsics.j(lookupTracker, "<this>");
        Intrinsics.j(from, "from");
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(name, "name");
        if (lookupTracker == LookupTracker.DO_NOTHING.f145021a || (location = from.getLocation()) == null) {
            return;
        }
        lookupTracker.b(location.a(), lookupTracker.a() ? location.getPosition() : Position.f145047c.a(), packageFqName, ScopeKind.f145051a, name);
    }
}
