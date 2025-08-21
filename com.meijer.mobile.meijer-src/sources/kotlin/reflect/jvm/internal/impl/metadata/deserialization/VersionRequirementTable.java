package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes14.dex */
public final class VersionRequirementTable {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f146457b = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final VersionRequirementTable f146458c = new VersionRequirementTable(CollectionsKt.m());

    /* renamed from: a, reason: collision with root package name */
    private final List<ProtoBuf.VersionRequirement> f146459a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VersionRequirementTable a(ProtoBuf.VersionRequirementTable table) {
            Intrinsics.j(table, "table");
            if (table.v() == 0) {
                return b();
            }
            List<ProtoBuf.VersionRequirement> listX = table.x();
            Intrinsics.i(listX, "getRequirementList(...)");
            return new VersionRequirementTable(listX, null);
        }

        public final VersionRequirementTable b() {
            return VersionRequirementTable.f146458c;
        }
    }

    public /* synthetic */ VersionRequirementTable(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private VersionRequirementTable(List<ProtoBuf.VersionRequirement> list) {
        this.f146459a = list;
    }
}
