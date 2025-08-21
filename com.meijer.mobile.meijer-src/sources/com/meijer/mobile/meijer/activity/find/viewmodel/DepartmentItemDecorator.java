package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.Department;
import bk.AbstractC6392a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002\u001d\u0019B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b\u0019\u0010%¨\u0006'"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "", "LCo/b;", "parent", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e$b;", "destination", "department", "Lbk/a;", "itemText", "", "children", "<init>", "(LCo/b;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e$b;LCo/b;Lbk/a;Ljava/util/List;)V", "e", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/b;", "getParent", "()LCo/b;", "b", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e$b;", "c", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/e$b;", "d", "Lbk/a;", "()Lbk/a;", "Ljava/util/List;", "()Ljava/util/List;", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class DepartmentItemDecorator {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f109269g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Department parent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b destination;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Department department;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a itemText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DepartmentItemDecorator> children;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e$a;", "", "<init>", "()V", "LCo/b;", "department", "parent", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "a", "(LCo/b;LCo/b;)Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DepartmentItemDecorator b(Companion companion, Department department, Department department2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                department2 = null;
            }
            return companion.a(department, department2);
        }

        public final DepartmentItemDecorator a(Department department, Department parent) {
            Intrinsics.j(department, "department");
            b bVar = b.f109276b;
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100346Be, department.getName());
            List<Department> listF = department.f();
            ArrayList<Department> arrayList = new ArrayList();
            for (Object obj : listF) {
                Department department2 = (Department) obj;
                if (!StringsKt.s0(department2.getId()) || !StringsKt.s0(department2.getCollectionId())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
            for (Department department3 : arrayList) {
                arrayList2.add(new DepartmentItemDecorator(department, department3.f().isEmpty() ? b.f109276b : b.f109275a, department3, AbstractC6392a.INSTANCE.c(department3.getName()), null, 16, null));
            }
            return new DepartmentItemDecorator(parent, bVar, department, abstractC6392aD, arrayList2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f109275a = new b("SUB_DEPARTMENTS", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f109276b = new b("PRODUCTS_PAGE", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f109277c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f109278d;

        private static final /* synthetic */ b[] a() {
            return new b[]{f109275a, f109276b};
        }

        static {
            b[] bVarArrA = a();
            f109277c = bVarArrA;
            f109278d = EnumEntriesKt.a(bVarArrA);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f109277c.clone();
        }

        private b(String str, int i10) {
        }
    }

    public DepartmentItemDecorator(Department department, b destination, Department department2, AbstractC6392a itemText, List<DepartmentItemDecorator> children) {
        Intrinsics.j(destination, "destination");
        Intrinsics.j(department2, "department");
        Intrinsics.j(itemText, "itemText");
        Intrinsics.j(children, "children");
        this.parent = department;
        this.destination = destination;
        this.department = department2;
        this.itemText = itemText;
        this.children = children;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepartmentItemDecorator)) {
            return false;
        }
        DepartmentItemDecorator departmentItemDecorator = (DepartmentItemDecorator) other;
        return Intrinsics.e(this.parent, departmentItemDecorator.parent) && this.destination == departmentItemDecorator.destination && Intrinsics.e(this.department, departmentItemDecorator.department) && Intrinsics.e(this.itemText, departmentItemDecorator.itemText) && Intrinsics.e(this.children, departmentItemDecorator.children);
    }

    public int hashCode() {
        Department department = this.parent;
        return ((((((((department == null ? 0 : department.hashCode()) * 31) + this.destination.hashCode()) * 31) + this.department.hashCode()) * 31) + this.itemText.hashCode()) * 31) + this.children.hashCode();
    }

    public String toString() {
        return "DepartmentItemDecorator(parent=" + this.parent + ", destination=" + this.destination + ", department=" + this.department + ", itemText=" + this.itemText + ", children=" + this.children + ')';
    }

    public final List<DepartmentItemDecorator> a() {
        return this.children;
    }

    /* renamed from: b, reason: from getter */
    public final Department getDepartment() {
        return this.department;
    }

    /* renamed from: c, reason: from getter */
    public final b getDestination() {
        return this.destination;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getItemText() {
        return this.itemText;
    }

    public final DepartmentItemDecorator e() {
        return INSTANCE.a(this.department, this.parent);
    }

    public /* synthetic */ DepartmentItemDecorator(Department department, b bVar, Department department2, AbstractC6392a abstractC6392a, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : department, bVar, department2, abstractC6392a, (i10 & 16) != 0 ? CollectionsKt.m() : list);
    }
}
