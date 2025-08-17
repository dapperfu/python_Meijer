package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes13.dex */
public final class BuiltInsProtoBuf {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f145479a = GeneratedMessageLite.o(ProtoBuf.Package.L(), 0, null, null, 151, WireFormat.FieldType.f145901g, Integer.class);

    /* renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f145480b;

    /* renamed from: c, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f145481c;

    /* renamed from: d, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f145482d;

    /* renamed from: e, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f145483e;

    /* renamed from: f, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f145484f;

    /* renamed from: g, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f145485g;

    /* renamed from: h, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f145486h;

    /* renamed from: i, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f145487i;

    /* renamed from: j, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f145488j;

    /* renamed from: k, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f145489k;

    /* renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f145490l;

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.a(f145479a);
        extensionRegistryLite.a(f145480b);
        extensionRegistryLite.a(f145481c);
        extensionRegistryLite.a(f145482d);
        extensionRegistryLite.a(f145483e);
        extensionRegistryLite.a(f145484f);
        extensionRegistryLite.a(f145485g);
        extensionRegistryLite.a(f145486h);
        extensionRegistryLite.a(f145487i);
        extensionRegistryLite.a(f145488j);
        extensionRegistryLite.a(f145489k);
        extensionRegistryLite.a(f145490l);
    }

    static {
        ProtoBuf.Class classE0 = ProtoBuf.Class.E0();
        ProtoBuf.Annotation annotationA = ProtoBuf.Annotation.A();
        WireFormat.FieldType fieldType = WireFormat.FieldType.f145907m;
        f145480b = GeneratedMessageLite.n(classE0, annotationA, null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f145481c = GeneratedMessageLite.n(ProtoBuf.Constructor.M(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f145482d = GeneratedMessageLite.n(ProtoBuf.Function.f0(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f145483e = GeneratedMessageLite.n(ProtoBuf.Property.d0(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f145484f = GeneratedMessageLite.n(ProtoBuf.Property.d0(), ProtoBuf.Annotation.A(), null, 152, fieldType, false, ProtoBuf.Annotation.class);
        f145485g = GeneratedMessageLite.n(ProtoBuf.Property.d0(), ProtoBuf.Annotation.A(), null, 153, fieldType, false, ProtoBuf.Annotation.class);
        f145486h = GeneratedMessageLite.o(ProtoBuf.Property.d0(), ProtoBuf.Annotation.Argument.Value.M(), ProtoBuf.Annotation.Argument.Value.M(), null, 151, fieldType, ProtoBuf.Annotation.Argument.Value.class);
        f145487i = GeneratedMessageLite.n(ProtoBuf.EnumEntry.E(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f145488j = GeneratedMessageLite.n(ProtoBuf.ValueParameter.J(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f145489k = GeneratedMessageLite.n(ProtoBuf.Type.Y(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f145490l = GeneratedMessageLite.n(ProtoBuf.TypeParameter.L(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
    }
}
