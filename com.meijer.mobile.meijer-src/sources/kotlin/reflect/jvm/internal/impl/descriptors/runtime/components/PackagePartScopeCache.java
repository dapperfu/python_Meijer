package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class PackagePartScopeCache {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedDescriptorResolver f144942a;

    /* renamed from: b, reason: collision with root package name */
    private final ReflectKotlinClassFinder f144943b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<ClassId, MemberScope> f144944c;

    public PackagePartScopeCache(DeserializedDescriptorResolver resolver, ReflectKotlinClassFinder kotlinClassFinder) {
        Intrinsics.j(resolver, "resolver");
        Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
        this.f144942a = resolver;
        this.f144943b = kotlinClassFinder;
        this.f144944c = new ConcurrentHashMap<>();
    }

    public final MemberScope a(ReflectKotlinClass fileClass) {
        Collection collectionE;
        Intrinsics.j(fileClass, "fileClass");
        ConcurrentHashMap<ClassId, MemberScope> concurrentHashMap = this.f144944c;
        ClassId classIdF = fileClass.f();
        MemberScope memberScope = concurrentHashMap.get(classIdF);
        if (memberScope == null) {
            FqName fqNameF = fileClass.f().f();
            if (fileClass.b().c() == KotlinClassHeader.Kind.f145778h) {
                List<String> listF = fileClass.b().f();
                collectionE = new ArrayList();
                for (String str : listF) {
                    ClassId.Companion companion = ClassId.f146581d;
                    FqName fqNameE = JvmClassName.d(str).e();
                    Intrinsics.i(fqNameE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    KotlinJvmBinaryClass kotlinJvmBinaryClassB = KotlinClassFinderKt.b(this.f144943b, companion.c(fqNameE), this.f144942a.f().g().d());
                    if (kotlinJvmBinaryClassB != null) {
                        collectionE.add(kotlinJvmBinaryClassB);
                    }
                }
            } else {
                collectionE = CollectionsKt.e(fileClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(this.f144942a.f().q(), fqNameF);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                MemberScope memberScopeC = this.f144942a.c(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it.next());
                if (memberScopeC != null) {
                    arrayList.add(memberScopeC);
                }
            }
            List listJ1 = CollectionsKt.j1(arrayList);
            MemberScope memberScopeA = ChainedMemberScope.f147156d.a("package " + fqNameF + " (" + fileClass + ')', listJ1);
            MemberScope memberScopePutIfAbsent = concurrentHashMap.putIfAbsent(classIdF, memberScopeA);
            memberScope = memberScopePutIfAbsent == null ? memberScopeA : memberScopePutIfAbsent;
        }
        Intrinsics.i(memberScope, "getOrPut(...)");
        return memberScope;
    }
}
