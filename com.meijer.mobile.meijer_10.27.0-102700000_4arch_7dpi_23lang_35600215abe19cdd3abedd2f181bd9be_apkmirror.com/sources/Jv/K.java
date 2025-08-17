package Jv;

import Iv.C3762c;
import Iv.JsonConfiguration;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LJv/K;", "", "LIv/g;", "configuration", "LJv/a;", "lexer", "<init>", "(LIv/g;LJv/a;)V", "LIv/i;", "h", "()LIv/i;", "Lkotlin/DeepRecursiveScope;", "", "i", "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "isString", "LIv/E;", "j", "(Z)LIv/E;", "g", "e", "a", "LJv/a;", "b", "Z", "isLenient", "c", "trailingCommaAllowed", "", "d", "I", "stackDepth", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JsonReader lexer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isLenient;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean trailingCommaAllowed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int stackDepth;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/DeepRecursiveScope;", "", "LIv/i;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
    static final class a extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, Iv.i>, Unit, Continuation<? super Iv.i>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16187b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f16188c;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DeepRecursiveScope<Unit, Iv.i> deepRecursiveScope, Unit unit, Continuation<? super Iv.i> continuation) {
            a aVar = K.this.new a(continuation);
            aVar.f16188c = deepRecursiveScope;
            return aVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f16187b;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.f16188c;
                byte bG = K.this.lexer.G();
                if (bG == 1) {
                    return K.this.j(true);
                }
                if (bG == 0) {
                    return K.this.j(false);
                }
                if (bG == 6) {
                    K k10 = K.this;
                    this.f16187b = 1;
                    obj = k10.i(deepRecursiveScope, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (bG == 8) {
                        return K.this.f();
                    }
                    JsonReader.x(K.this.lexer, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return (Iv.i) obj;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f16190a;

        /* renamed from: b, reason: collision with root package name */
        Object f16191b;

        /* renamed from: c, reason: collision with root package name */
        Object f16192c;

        /* renamed from: d, reason: collision with root package name */
        Object f16193d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f16194e;

        /* renamed from: g, reason: collision with root package name */
        int f16196g;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16194e = obj;
            this.f16196g |= Integer.MIN_VALUE;
            return K.this.i(null, this);
        }
    }

    public K(JsonConfiguration configuration, JsonReader lexer) {
        Intrinsics.j(configuration, "configuration");
        Intrinsics.j(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.getIsLenient();
        this.trailingCommaAllowed = configuration.getAllowTrailingComma();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iv.i f() {
        byte bJ = this.lexer.j();
        if (this.lexer.G() == 4) {
            JsonReader.x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.lexer.e()) {
            arrayList.add(e());
            bJ = this.lexer.j();
            if (bJ != 4) {
                JsonReader jsonReader = this.lexer;
                boolean z10 = bJ == 9;
                int i10 = jsonReader.currentPosition;
                if (!z10) {
                    JsonReader.x(jsonReader, "Expected end of the array or comma", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bJ == 8) {
            this.lexer.k((byte) 9);
        } else if (bJ == 4) {
            if (!this.trailingCommaAllowed) {
                A.g(this.lexer, "array");
                throw new KotlinNothingValueException();
            }
            this.lexer.k((byte) 9);
        }
        return new C3762c(arrayList);
    }

    private final Iv.i g() {
        return (Iv.i) DeepRecursiveKt.b(new DeepRecursiveFunction(new a(null)), Unit.f142422a);
    }

    private final Iv.i h() {
        byte bK = this.lexer.k((byte) 6);
        if (this.lexer.G() == 4) {
            JsonReader.x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.lexer.e()) {
                break;
            }
            String strQ = this.isLenient ? this.lexer.q() : this.lexer.o();
            this.lexer.k((byte) 5);
            linkedHashMap.put(strQ, e());
            bK = this.lexer.j();
            if (bK != 4) {
                if (bK != 7) {
                    JsonReader.x(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bK == 6) {
            this.lexer.k((byte) 7);
        } else if (bK == 4) {
            if (!this.trailingCommaAllowed) {
                A.h(this.lexer, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.lexer.k((byte) 7);
        }
        return new Iv.C(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.DeepRecursiveScope<kotlin.Unit, Iv.i> r20, kotlin.coroutines.Continuation<? super Iv.i> r21) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jv.K.i(kotlin.DeepRecursiveScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iv.E j(boolean isString) {
        String strQ = (this.isLenient || !isString) ? this.lexer.q() : this.lexer.o();
        return (isString || !Intrinsics.e(strQ, BuildConfig.TRAVIS)) ? new Iv.v(strQ, isString, null, 4, null) : Iv.z.INSTANCE;
    }

    public final Iv.i e() {
        byte bG = this.lexer.G();
        if (bG == 1) {
            return j(true);
        }
        if (bG == 0) {
            return j(false);
        }
        if (bG == 6) {
            int i10 = this.stackDepth + 1;
            this.stackDepth = i10;
            this.stackDepth--;
            return i10 == 200 ? g() : h();
        }
        if (bG == 8) {
            return f();
        }
        JsonReader.x(this.lexer, "Cannot read Json element because of unexpected " + C3919b.c(bG), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
