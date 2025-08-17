package Jv;

import Iv.AbstractC3761b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.UStringsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"LJv/y;", "LGv/a;", "LJv/a;", "lexer", "LIv/b;", "json", "<init>", "(LJv/a;LIv/b;)V", "LFv/f;", "descriptor", "", "v", "(LFv/f;)I", "h", "()I", "", "k", "()J", "", "E", "()B", "", "o", "()S", "a", "LJv/a;", "LMv/c;", "b", "LMv/c;", "()LMv/c;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Jv.y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3941y extends Gv.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JsonReader lexer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mv.c serializersModule;

    public C3941y(JsonReader lexer, AbstractC3761b json) {
        Intrinsics.j(lexer, "lexer");
        Intrinsics.j(json, "json");
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
    }

    @Override // Gv.a, Gv.e
    public byte E() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            return UStringsKt.a(strQ);
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'UByte' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Gv.c
    /* renamed from: b, reason: from getter */
    public Mv.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // Gv.a, Gv.e
    public int h() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            return UStringsKt.d(strQ);
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'UInt' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Gv.a, Gv.e
    public long k() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            return UStringsKt.g(strQ);
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'ULong' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Gv.a, Gv.e
    public short o() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            return UStringsKt.j(strQ);
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'UShort' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Gv.c
    public int v(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }
}
