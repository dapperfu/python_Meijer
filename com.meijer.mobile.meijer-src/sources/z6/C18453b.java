package z6;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0000*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012\" \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u0012\u0004\b \u0010!\"\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0012\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010'\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010'\"\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010'\"\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010'\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0011018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0016018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00103\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00103\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\f018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u00103\"\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0005018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u00103¨\u0006="}, d2 = {"T", "Lz6/a;", "Lz6/D;", "e", "(Lz6/a;)Lz6/D;", "", "Lz6/y;", "b", "(Lz6/a;)Lz6/y;", "Lz6/x;", "a", "(Lz6/a;)Lz6/x;", "", "buffered", "Lz6/z;", "c", "(Lz6/a;Z)Lz6/z;", "", "Lz6/a;", "StringAdapter", "", "IntAdapter", "", "DoubleAdapter", "", "d", "FloatAdapter", "", "LongAdapter", "f", "BooleanAdapter", "g", "getAnyAdapter$annotations", "()V", "AnyAdapter", "Lz6/F;", "h", "UploadAdapter", "i", "Lz6/y;", "NullableStringAdapter", "j", "NullableDoubleAdapter", "k", "NullableIntAdapter", "l", "NullableBooleanAdapter", "m", "NullableAnyAdapter", "Lz6/c;", "n", "Lz6/c;", "ApolloOptionalStringAdapter", "o", "ApolloOptionalDoubleAdapter", "p", "ApolloOptionalIntAdapter", "q", "ApolloOptionalBooleanAdapter", "r", "ApolloOptionalAnyAdapter", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: z6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18453b {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18452a<String> f172408a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18452a<Integer> f172409b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18452a<Double> f172410c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18452a<Float> f172411d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18452a<Long> f172412e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18452a<Boolean> f172413f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18452a<Object> f172414g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18452a<F> f172415h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final y<String> f172416i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final y<Double> f172417j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final y<Integer> f172418k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final y<Boolean> f172419l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final y<Object> f172420m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final C18454c<String> f172421n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final C18454c<Double> f172422o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final C18454c<Integer> f172423p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final C18454c<Boolean> f172424q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final C18454c<Object> f172425r;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"z6/b$a", "Lz6/a;", "", "LD6/f;", "reader", "c", "(LD6/f;)Ljava/lang/Object;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Ljava/lang/Object;)V", "Lz6/p;", "customScalarAdapters", "b", "(LD6/f;Lz6/p;)Ljava/lang/Object;", "a", "(LD6/g;Lz6/p;Ljava/lang/Object;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.b$a */
    public static final class a implements InterfaceC18452a<Object> {
        @Override // z6.InterfaceC18452a
        public void a(D6.g writer, p customScalarAdapters, Object value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            Intrinsics.j(value, "value");
            d(writer, value);
        }

        @Override // z6.InterfaceC18452a
        public Object b(D6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return c(reader);
        }

        public final Object c(D6.f reader) {
            Intrinsics.j(reader, "reader");
            Object objD = D6.a.d(reader);
            Intrinsics.g(objD);
            return objD;
        }

        public final void d(D6.g writer, Object value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            D6.b.a(writer, value);
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"z6/b$b", "Lz6/a;", "", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)Ljava/lang/Boolean;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;Z)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.b$b, reason: collision with other inner class name */
    public static final class C2784b implements InterfaceC18452a<Boolean> {
        @Override // z6.InterfaceC18452a
        public /* bridge */ /* synthetic */ void a(D6.g gVar, p pVar, Boolean bool) throws IOException {
            d(gVar, pVar, bool.booleanValue());
        }

        @Override // z6.InterfaceC18452a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean b(D6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Boolean.valueOf(reader.nextBoolean());
        }

        public void d(D6.g writer, p customScalarAdapters, boolean value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.C0(value);
        }

        C2784b() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"z6/b$c", "Lz6/a;", "", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)Ljava/lang/Double;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;D)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.b$c */
    public static final class c implements InterfaceC18452a<Double> {
        @Override // z6.InterfaceC18452a
        public /* bridge */ /* synthetic */ void a(D6.g gVar, p pVar, Double d10) throws IOException {
            d(gVar, pVar, d10.doubleValue());
        }

        @Override // z6.InterfaceC18452a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double b(D6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Double.valueOf(reader.nextDouble());
        }

        public void d(D6.g writer, p customScalarAdapters, double value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.c0(value);
        }

        c() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"z6/b$d", "Lz6/a;", "", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)Ljava/lang/Float;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;F)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.b$d */
    public static final class d implements InterfaceC18452a<Float> {
        @Override // z6.InterfaceC18452a
        public /* bridge */ /* synthetic */ void a(D6.g gVar, p pVar, Float f10) throws IOException {
            d(gVar, pVar, f10.floatValue());
        }

        @Override // z6.InterfaceC18452a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float b(D6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Float.valueOf((float) reader.nextDouble());
        }

        public void d(D6.g writer, p customScalarAdapters, float value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.c0(value);
        }

        d() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"z6/b$e", "Lz6/a;", "", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)Ljava/lang/Integer;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;I)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.b$e */
    public static final class e implements InterfaceC18452a<Integer> {
        @Override // z6.InterfaceC18452a
        public /* bridge */ /* synthetic */ void a(D6.g gVar, p pVar, Integer num) throws IOException {
            d(gVar, pVar, num.intValue());
        }

        @Override // z6.InterfaceC18452a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(D6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Integer.valueOf(reader.nextInt());
        }

        public void d(D6.g writer, p customScalarAdapters, int value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.W(value);
        }

        e() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"z6/b$f", "Lz6/a;", "", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)Ljava/lang/Long;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;J)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.b$f */
    public static final class f implements InterfaceC18452a<Long> {
        @Override // z6.InterfaceC18452a
        public /* bridge */ /* synthetic */ void a(D6.g gVar, p pVar, Long l10) throws IOException {
            d(gVar, pVar, l10.longValue());
        }

        @Override // z6.InterfaceC18452a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long b(D6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Long.valueOf(reader.nextLong());
        }

        public void d(D6.g writer, p customScalarAdapters, long value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.U(value);
        }

        f() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"z6/b$g", "Lz6/a;", "", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)Ljava/lang/String;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.b$g */
    public static final class g implements InterfaceC18452a<String> {
        @Override // z6.InterfaceC18452a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(D6.f reader, p customScalarAdapters) throws IOException {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            String strNextString = reader.nextString();
            Intrinsics.g(strNextString);
            return strNextString;
        }

        @Override // z6.InterfaceC18452a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(D6.g writer, p customScalarAdapters, String value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            Intrinsics.j(value, "value");
            writer.e2(value);
        }

        g() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"z6/b$h", "Lz6/a;", "Lz6/F;", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)Lz6/F;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;Lz6/F;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.b$h */
    public static final class h implements InterfaceC18452a<F> {
        @Override // z6.InterfaceC18452a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public F b(D6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            throw new IllegalStateException("File Upload used in output position");
        }

        @Override // z6.InterfaceC18452a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(D6.g writer, p customScalarAdapters, F value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            Intrinsics.j(value, "value");
            writer.i3(value);
        }

        h() {
        }
    }

    static {
        g gVar = new g();
        f172408a = gVar;
        e eVar = new e();
        f172409b = eVar;
        c cVar = new c();
        f172410c = cVar;
        f172411d = new d();
        f172412e = new f();
        C2784b c2784b = new C2784b();
        f172413f = c2784b;
        a aVar = new a();
        f172414g = aVar;
        f172415h = new h();
        f172416i = b(gVar);
        f172417j = b(cVar);
        f172418k = b(eVar);
        f172419l = b(c2784b);
        f172420m = b(aVar);
        f172421n = new C18454c<>(gVar);
        f172422o = new C18454c<>(cVar);
        f172423p = new C18454c<>(eVar);
        f172424q = new C18454c<>(c2784b);
        f172425r = new C18454c<>(aVar);
    }

    @JvmName
    public static final <T> x<T> a(InterfaceC18452a<T> interfaceC18452a) {
        Intrinsics.j(interfaceC18452a, "<this>");
        return new x<>(interfaceC18452a);
    }

    @JvmName
    public static final <T> y<T> b(InterfaceC18452a<T> interfaceC18452a) {
        Intrinsics.j(interfaceC18452a, "<this>");
        return new y<>(interfaceC18452a);
    }

    @JvmName
    public static final <T> z<T> c(InterfaceC18452a<T> interfaceC18452a, boolean z10) {
        Intrinsics.j(interfaceC18452a, "<this>");
        return new z<>(interfaceC18452a, z10);
    }

    public static /* synthetic */ z d(InterfaceC18452a interfaceC18452a, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(interfaceC18452a, z10);
    }

    @JvmName
    public static final <T> D<T> e(InterfaceC18452a<T> interfaceC18452a) {
        Intrinsics.j(interfaceC18452a, "<this>");
        return new D<>(interfaceC18452a);
    }
}
