package Iv;

import Jv.C3937u;
import Jv.Q;
import Jv.U;
import Jv.V;
import Jv.Y;
import Jv.Z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00192\u00020\u0001:\u0001\u0016B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010$\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u0082\u0001\u0002%&¨\u0006'"}, d2 = {"LIv/b;", "", "LIv/g;", "configuration", "LMv/c;", "serializersModule", "<init>", "(LIv/g;LMv/c;)V", "T", "LDv/h;", "serializer", "value", "", "c", "(LDv/h;Ljava/lang/Object;)Ljava/lang/String;", "LDv/a;", "deserializer", "string", "b", "(LDv/a;Ljava/lang/String;)Ljava/lang/Object;", "LIv/i;", "element", "a", "(LDv/a;LIv/i;)Ljava/lang/Object;", "LIv/g;", "d", "()LIv/g;", "LMv/c;", "e", "()LMv/c;", "LJv/u;", "LJv/u;", "f", "()LJv/u;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "_schemaCache", "LIv/b$a;", "LIv/t;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Iv.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC3761b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JsonConfiguration configuration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mv.c serializersModule;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C3937u _schemaCache;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIv/b$a;", "LIv/b;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Iv.b$a, reason: from kotlin metadata */
    public static final class Companion extends AbstractC3761b {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), Mv.d.a(), null);
        }
    }

    public /* synthetic */ AbstractC3761b(JsonConfiguration jsonConfiguration, Mv.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonConfiguration, cVar);
    }

    private AbstractC3761b(JsonConfiguration jsonConfiguration, Mv.c cVar) {
        this.configuration = jsonConfiguration;
        this.serializersModule = cVar;
        this._schemaCache = new C3937u();
    }

    public final <T> T a(Dv.a<? extends T> deserializer, i element) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(element, "element");
        return (T) Y.a(this, element, deserializer);
    }

    public final <T> T b(Dv.a<? extends T> deserializer, String string) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(string, "string");
        U uA = V.a(this, string);
        T t10 = (T) new Q(this, Z.f16225c, uA, deserializer.getDescriptor(), null).G(deserializer);
        uA.v();
        return t10;
    }

    public final <T> String c(Dv.h<? super T> serializer, T value) {
        Intrinsics.j(serializer, "serializer");
        Jv.G g10 = new Jv.G();
        try {
            Jv.F.b(this, g10, serializer, value);
            return g10.toString();
        } finally {
            g10.g();
        }
    }

    /* renamed from: d, reason: from getter */
    public final JsonConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: e, reason: from getter */
    public Mv.c getSerializersModule() {
        return this.serializersModule;
    }

    /* renamed from: f, reason: from getter */
    public final C3937u get_schemaCache() {
        return this._schemaCache;
    }
}
