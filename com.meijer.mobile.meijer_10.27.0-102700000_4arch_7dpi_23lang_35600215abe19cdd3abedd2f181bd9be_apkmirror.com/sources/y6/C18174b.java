package y6;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0000*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012\" \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u0012\u0004\b \u0010!\"\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0012\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010'\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010'\"\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010'\"\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010'\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0011018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0016018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00103\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00103\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\f018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u00103\"\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0005018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u00103¨\u0006="}, d2 = {"T", "Ly6/a;", "Ly6/D;", "e", "(Ly6/a;)Ly6/D;", "", "Ly6/y;", "b", "(Ly6/a;)Ly6/y;", "Ly6/x;", "a", "(Ly6/a;)Ly6/x;", "", "buffered", "Ly6/z;", "c", "(Ly6/a;Z)Ly6/z;", "", "Ly6/a;", "StringAdapter", "", "IntAdapter", "", "DoubleAdapter", "", "d", "FloatAdapter", "", "LongAdapter", "f", "BooleanAdapter", "g", "getAnyAdapter$annotations", "()V", "AnyAdapter", "Ly6/F;", "h", "UploadAdapter", "i", "Ly6/y;", "NullableStringAdapter", "j", "NullableDoubleAdapter", "k", "NullableIntAdapter", "l", "NullableBooleanAdapter", "m", "NullableAnyAdapter", "Ly6/c;", "n", "Ly6/c;", "ApolloOptionalStringAdapter", "o", "ApolloOptionalDoubleAdapter", "p", "ApolloOptionalIntAdapter", "q", "ApolloOptionalBooleanAdapter", "r", "ApolloOptionalAnyAdapter", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: y6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18174b {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18173a<String> f170222a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18173a<Integer> f170223b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18173a<Double> f170224c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18173a<Float> f170225d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18173a<Long> f170226e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18173a<Boolean> f170227f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18173a<Object> f170228g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final InterfaceC18173a<InterfaceC18172F> f170229h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final y<String> f170230i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final y<Double> f170231j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final y<Integer> f170232k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final y<Boolean> f170233l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final y<Object> f170234m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final C18175c<String> f170235n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final C18175c<Double> f170236o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final C18175c<Integer> f170237p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final C18175c<Boolean> f170238q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final C18175c<Object> f170239r;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"y6/b$a", "Ly6/a;", "", "LC6/f;", "reader", "c", "(LC6/f;)Ljava/lang/Object;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ljava/lang/Object;)V", "Ly6/p;", "customScalarAdapters", "b", "(LC6/f;Ly6/p;)Ljava/lang/Object;", "a", "(LC6/g;Ly6/p;Ljava/lang/Object;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.b$a */
    public static final class a implements InterfaceC18173a<Object> {
        @Override // y6.InterfaceC18173a
        public void a(C6.g writer, p customScalarAdapters, Object value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            Intrinsics.j(value, "value");
            d(writer, value);
        }

        @Override // y6.InterfaceC18173a
        public Object b(C6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return c(reader);
        }

        public final Object c(C6.f reader) {
            Intrinsics.j(reader, "reader");
            Object objD = C6.a.d(reader);
            Intrinsics.g(objD);
            return objD;
        }

        public final void d(C6.g writer, Object value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            C6.b.a(writer, value);
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"y6/b$b", "Ly6/a;", "", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)Ljava/lang/Boolean;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;Z)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.b$b, reason: collision with other inner class name */
    public static final class C2743b implements InterfaceC18173a<Boolean> {
        @Override // y6.InterfaceC18173a
        public /* bridge */ /* synthetic */ void a(C6.g gVar, p pVar, Boolean bool) throws IOException {
            d(gVar, pVar, bool.booleanValue());
        }

        @Override // y6.InterfaceC18173a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean b(C6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Boolean.valueOf(reader.nextBoolean());
        }

        public void d(C6.g writer, p customScalarAdapters, boolean value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.E0(value);
        }

        C2743b() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"y6/b$c", "Ly6/a;", "", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)Ljava/lang/Double;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;D)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.b$c */
    public static final class c implements InterfaceC18173a<Double> {
        @Override // y6.InterfaceC18173a
        public /* bridge */ /* synthetic */ void a(C6.g gVar, p pVar, Double d10) throws IOException {
            d(gVar, pVar, d10.doubleValue());
        }

        @Override // y6.InterfaceC18173a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double b(C6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Double.valueOf(reader.nextDouble());
        }

        public void d(C6.g writer, p customScalarAdapters, double value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.d0(value);
        }

        c() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"y6/b$d", "Ly6/a;", "", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)Ljava/lang/Float;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;F)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.b$d */
    public static final class d implements InterfaceC18173a<Float> {
        @Override // y6.InterfaceC18173a
        public /* bridge */ /* synthetic */ void a(C6.g gVar, p pVar, Float f10) throws IOException {
            d(gVar, pVar, f10.floatValue());
        }

        @Override // y6.InterfaceC18173a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float b(C6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Float.valueOf((float) reader.nextDouble());
        }

        public void d(C6.g writer, p customScalarAdapters, float value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.d0(value);
        }

        d() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"y6/b$e", "Ly6/a;", "", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)Ljava/lang/Integer;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;I)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.b$e */
    public static final class e implements InterfaceC18173a<Integer> {
        @Override // y6.InterfaceC18173a
        public /* bridge */ /* synthetic */ void a(C6.g gVar, p pVar, Integer num) throws IOException {
            d(gVar, pVar, num.intValue());
        }

        @Override // y6.InterfaceC18173a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(C6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Integer.valueOf(reader.nextInt());
        }

        public void d(C6.g writer, p customScalarAdapters, int value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.W(value);
        }

        e() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"y6/b$f", "Ly6/a;", "", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)Ljava/lang/Long;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;J)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.b$f */
    public static final class f implements InterfaceC18173a<Long> {
        @Override // y6.InterfaceC18173a
        public /* bridge */ /* synthetic */ void a(C6.g gVar, p pVar, Long l10) throws IOException {
            d(gVar, pVar, l10.longValue());
        }

        @Override // y6.InterfaceC18173a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long b(C6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            return Long.valueOf(reader.nextLong());
        }

        public void d(C6.g writer, p customScalarAdapters, long value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            writer.U(value);
        }

        f() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"y6/b$g", "Ly6/a;", "", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)Ljava/lang/String;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.b$g */
    public static final class g implements InterfaceC18173a<String> {
        @Override // y6.InterfaceC18173a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(C6.f reader, p customScalarAdapters) throws IOException {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            String strNextString = reader.nextString();
            Intrinsics.g(strNextString);
            return strNextString;
        }

        @Override // y6.InterfaceC18173a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(C6.g writer, p customScalarAdapters, String value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            Intrinsics.j(value, "value");
            writer.f2(value);
        }

        g() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"y6/b$h", "Ly6/a;", "Ly6/F;", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)Ly6/F;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;Ly6/F;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.b$h */
    public static final class h implements InterfaceC18173a<InterfaceC18172F> {
        @Override // y6.InterfaceC18173a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC18172F b(C6.f reader, p customScalarAdapters) {
            Intrinsics.j(reader, "reader");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            throw new IllegalStateException("File Upload used in output position");
        }

        @Override // y6.InterfaceC18173a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(C6.g writer, p customScalarAdapters, InterfaceC18172F value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            Intrinsics.j(value, "value");
            writer.I2(value);
        }

        h() {
        }
    }

    static {
        g gVar = new g();
        f170222a = gVar;
        e eVar = new e();
        f170223b = eVar;
        c cVar = new c();
        f170224c = cVar;
        f170225d = new d();
        f170226e = new f();
        C2743b c2743b = new C2743b();
        f170227f = c2743b;
        a aVar = new a();
        f170228g = aVar;
        f170229h = new h();
        f170230i = b(gVar);
        f170231j = b(cVar);
        f170232k = b(eVar);
        f170233l = b(c2743b);
        f170234m = b(aVar);
        f170235n = new C18175c<>(gVar);
        f170236o = new C18175c<>(cVar);
        f170237p = new C18175c<>(eVar);
        f170238q = new C18175c<>(c2743b);
        f170239r = new C18175c<>(aVar);
    }

    @JvmName
    public static final <T> x<T> a(InterfaceC18173a<T> interfaceC18173a) {
        Intrinsics.j(interfaceC18173a, "<this>");
        return new x<>(interfaceC18173a);
    }

    @JvmName
    public static final <T> y<T> b(InterfaceC18173a<T> interfaceC18173a) {
        Intrinsics.j(interfaceC18173a, "<this>");
        return new y<>(interfaceC18173a);
    }

    @JvmName
    public static final <T> z<T> c(InterfaceC18173a<T> interfaceC18173a, boolean z10) {
        Intrinsics.j(interfaceC18173a, "<this>");
        return new z<>(interfaceC18173a, z10);
    }

    public static /* synthetic */ z d(InterfaceC18173a interfaceC18173a, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(interfaceC18173a, z10);
    }

    @JvmName
    public static final <T> C18170D<T> e(InterfaceC18173a<T> interfaceC18173a) {
        Intrinsics.j(interfaceC18173a, "<this>");
        return new C18170D<>(interfaceC18173a);
    }
}
