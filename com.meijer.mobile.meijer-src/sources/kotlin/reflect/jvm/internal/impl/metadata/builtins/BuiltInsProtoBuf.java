package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes14.dex */
public final class BuiltInsProtoBuf {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f146386a = GeneratedMessageLite.o(ProtoBuf.Package.L(), 0, null, null, 151, WireFormat.FieldType.f146808g, Integer.class);

    /* renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f146387b;

    /* renamed from: c, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f146388c;

    /* renamed from: d, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f146389d;

    /* renamed from: e, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f146390e;

    /* renamed from: f, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f146391f;

    /* renamed from: g, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f146392g;

    /* renamed from: h, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f146393h;

    /* renamed from: i, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f146394i;

    /* renamed from: j, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f146395j;

    /* renamed from: k, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f146396k;

    /* renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f146397l;

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.a(f146386a);
        extensionRegistryLite.a(f146387b);
        extensionRegistryLite.a(f146388c);
        extensionRegistryLite.a(f146389d);
        extensionRegistryLite.a(f146390e);
        extensionRegistryLite.a(f146391f);
        extensionRegistryLite.a(f146392g);
        extensionRegistryLite.a(f146393h);
        extensionRegistryLite.a(f146394i);
        extensionRegistryLite.a(f146395j);
        extensionRegistryLite.a(f146396k);
        extensionRegistryLite.a(f146397l);
    }

    static {
        ProtoBuf.Class classE0 = ProtoBuf.Class.E0();
        ProtoBuf.Annotation annotationA = ProtoBuf.Annotation.A();
        WireFormat.FieldType fieldType = WireFormat.FieldType.f146814m;
        f146387b = GeneratedMessageLite.n(classE0, annotationA, null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f146388c = GeneratedMessageLite.n(ProtoBuf.Constructor.M(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f146389d = GeneratedMessageLite.n(ProtoBuf.Function.f0(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f146390e = GeneratedMessageLite.n(ProtoBuf.Property.d0(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f146391f = GeneratedMessageLite.n(ProtoBuf.Property.d0(), ProtoBuf.Annotation.A(), null, 152, fieldType, false, ProtoBuf.Annotation.class);
        f146392g = GeneratedMessageLite.n(ProtoBuf.Property.d0(), ProtoBuf.Annotation.A(), null, 153, fieldType, false, ProtoBuf.Annotation.class);
        f146393h = GeneratedMessageLite.o(ProtoBuf.Property.d0(), ProtoBuf.Annotation.Argument.Value.M(), ProtoBuf.Annotation.Argument.Value.M(), null, 151, fieldType, ProtoBuf.Annotation.Argument.Value.class);
        f146394i = GeneratedMessageLite.n(ProtoBuf.EnumEntry.E(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f146395j = GeneratedMessageLite.n(ProtoBuf.ValueParameter.J(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f146396k = GeneratedMessageLite.n(ProtoBuf.Type.Y(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
        f146397l = GeneratedMessageLite.n(ProtoBuf.TypeParameter.L(), ProtoBuf.Annotation.A(), null, BinsView.TOTE_WIDTH_DP, fieldType, false, ProtoBuf.Annotation.class);
    }
}
