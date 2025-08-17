package com.squareup.wire;

import j$.time.Duration;
import j$.time.Instant;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kw.C15331h;
import kw.InterfaceC15330g;
import kw.w;
import lu.C15501a;
import lu.b;
import lu.d;
import lu.e;
import lu.f;
import lu.g;
import lu.h;
import lu.j;
import lu.l;
import lu.m;
import lu.n;
import lu.o;
import lu.p;
import lu.q;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0019\b&\u0018\u0000 0*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002D-BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000fB1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B;\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00028\u00002\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00028\u00002\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0000¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b3\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001c\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u00105\u001a\u0004\b>\u00107R(\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b@\u0010.R(\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\bB\u0010.¨\u0006E"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", "E", "", "Llu/d;", "fieldEncoding", "Lkotlin/reflect/KClass;", "type", "", "typeUrl", "Llu/q;", "syntax", "identity", "sourceFile", "<init>", "(Llu/d;Lkotlin/reflect/KClass;Ljava/lang/String;Llu/q;Ljava/lang/Object;Ljava/lang/String;)V", "(Llu/d;Lkotlin/reflect/KClass;)V", "(Llu/d;Lkotlin/reflect/KClass;Ljava/lang/String;Llu/q;)V", "(Llu/d;Lkotlin/reflect/KClass;Ljava/lang/String;Llu/q;Ljava/lang/Object;)V", "value", "", "g", "(Ljava/lang/Object;)I", "tag", "h", "(ILjava/lang/Object;)I", "Llu/o;", "writer", "", "e", "(Llu/o;Ljava/lang/Object;)V", "f", "(Llu/o;ILjava/lang/Object;)V", "Llu/n;", "reader", "d", "(Llu/n;)Ljava/lang/Object;", "Lkw/g;", "source", "c", "(Lkw/g;)Ljava/lang/Object;", "Ljava/io/InputStream;", "stream", "b", "(Ljava/io/InputStream;)Ljava/lang/Object;", "", "a", "()Lcom/squareup/wire/ProtoAdapter;", "Llu/d;", "i", "()Llu/d;", "Lkotlin/reflect/KClass;", "l", "()Lkotlin/reflect/KClass;", "Ljava/lang/String;", "getTypeUrl", "()Ljava/lang/String;", "Llu/q;", "k", "()Llu/q;", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "getSourceFile", "Lcom/squareup/wire/ProtoAdapter;", "getPackedAdapter$wire_runtime", "packedAdapter", "getRepeatedAdapter$wire_runtime", "repeatedAdapter", "EnumConstantNotFoundException", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public abstract class ProtoAdapter<E> {

    /* renamed from: A, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f126610A;

    /* renamed from: B, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f126611B;

    /* renamed from: C, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f126612C;

    /* renamed from: D, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f126613D;

    /* renamed from: E, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Float> f126614E;

    /* renamed from: F, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<float[]> f126615F;

    /* renamed from: G, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Double> f126616G;

    /* renamed from: H, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<double[]> f126617H;

    /* renamed from: I, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<C15331h> f126618I;

    /* renamed from: J, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<String> f126619J;

    /* renamed from: K, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Unit> f126620K;

    /* renamed from: L, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Map<String, ?>> f126621L;

    /* renamed from: M, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<List<?>> f126622M;

    /* renamed from: N, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter f126623N;

    /* renamed from: O, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Object> f126624O;

    /* renamed from: P, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Double> f126625P;

    /* renamed from: Q, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Float> f126626Q;

    /* renamed from: R, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f126627R;

    /* renamed from: S, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f126628S;

    /* renamed from: T, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f126629T;

    /* renamed from: U, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f126630U;

    /* renamed from: V, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Boolean> f126631V;

    /* renamed from: W, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<String> f126632W;

    /* renamed from: X, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<C15331h> f126633X;

    /* renamed from: Y, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Duration> f126634Y;

    /* renamed from: Z, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Instant> f126635Z;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Boolean> f126637j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f126638k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f126639l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f126640m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f126641n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f126642o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f126643p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f126644q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f126645r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f126646s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f126647t;

    /* renamed from: u, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f126648u;

    /* renamed from: v, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f126649v;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f126650w;

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f126651x;

    /* renamed from: y, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f126652y;

    /* renamed from: z, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f126653z;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d fieldEncoding;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final KClass<?> type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String typeUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q syntax;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final E identity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String sourceFile;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<List<E>> packedAdapter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<List<E>> repeatedAdapter;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "value", "Lkotlin/reflect/KClass;", "type", "<init>", "(ILkotlin/reflect/KClass;)V", "a", "I", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final int value;

        public EnumConstantNotFoundException(int i10, KClass<?> kClass) {
            Class clsB;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown enum tag ");
            sb2.append(i10);
            sb2.append(" for ");
            sb2.append((kClass == null || (clsB = JvmClassMappingKt.b(kClass)) == null) ? null : clsB.getName());
            super(sb2.toString());
            this.value = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\u0006\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u000eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u000eR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000eR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000eR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000eR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u000eR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000eR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u000eR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u000eR\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000eR\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u000eR&\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0002\b\u0003\u0018\u00010\t0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u000eR \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u0001060\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u000eR\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u000eR\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u000eR\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u000eR\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u000eR\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u000eR\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u000eR\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u000eR\u001c\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u000eR\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u000eR\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u000eR\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u000eR\u001e\u0010F\u001a\f\u0012\b\u0012\u00060Dj\u0002`E0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u000eR\u001e\u0010I\u001a\f\u0012\b\u0012\u00060Gj\u0002`H0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u000e¨\u0006J"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$a;", "", "<init>", "()V", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "valueAdapter", "", "a", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "", "BOOL", "Lcom/squareup/wire/ProtoAdapter;", "", "INT32", "", "INT32_ARRAY", "UINT32", "UINT32_ARRAY", "SINT32", "SINT32_ARRAY", "FIXED32", "FIXED32_ARRAY", "SFIXED32", "SFIXED32_ARRAY", "", "INT64", "", "INT64_ARRAY", "UINT64", "UINT64_ARRAY", "SINT64", "SINT64_ARRAY", "FIXED64", "FIXED64_ARRAY", "SFIXED64", "SFIXED64_ARRAY", "", "FLOAT", "", "FLOAT_ARRAY", "", "DOUBLE", "", "DOUBLE_ARRAY", "Lkw/h;", "BYTES", "", "STRING", "", "EMPTY", "STRUCT_MAP", "", "STRUCT_LIST", "", "STRUCT_NULL", "STRUCT_VALUE", "DOUBLE_VALUE", "FLOAT_VALUE", "INT64_VALUE", "UINT64_VALUE", "INT32_VALUE", "UINT32_VALUE", "BOOL_VALUE", "STRING_VALUE", "BYTES_VALUE", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "DURATION", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "INSTANT", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.squareup.wire.ProtoAdapter$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$a$a;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "value", "o", "(Ljava/lang/Void;)Ljava/lang/Void;", "Llu/o;", "writer", "n", "(Llu/o;Ljava/lang/Void;)Ljava/lang/Void;", "Llu/n;", "reader", "m", "(Llu/n;)Ljava/lang/Void;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.squareup.wire.ProtoAdapter$a$a, reason: collision with other inner class name */
        public static final class C1986a extends ProtoAdapter {
            public C1986a() {
                super(d.f149408e, Reflection.b(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int g(Object obj) {
                return ((Number) o((Void) obj)).intValue();
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Void d(n reader) {
                Intrinsics.j(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Void e(o writer, Void value) {
                Intrinsics.j(writer, "writer");
                Intrinsics.j(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            public Void o(Void value) {
                Intrinsics.j(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <K, V> ProtoAdapter<Map<K, V>> a(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
            Intrinsics.j(keyAdapter, "keyAdapter");
            Intrinsics.j(valueAdapter, "valueAdapter");
            return new j(keyAdapter, valueAdapter);
        }
    }

    public ProtoAdapter(d fieldEncoding, KClass<?> kClass, String str, q syntax, E e10, String str2) {
        l lVar;
        d dVar;
        Intrinsics.j(fieldEncoding, "fieldEncoding");
        Intrinsics.j(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = kClass;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e10;
        this.sourceFile = str2;
        boolean z10 = this instanceof l;
        p pVar = null;
        if (z10 || (this instanceof p) || fieldEncoding == (dVar = d.f149408e)) {
            lVar = null;
        } else {
            if (getFieldEncoding() == dVar) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            lVar = new l(this);
        }
        this.packedAdapter = lVar;
        if (!(this instanceof p) && !z10) {
            pVar = new p(this);
        }
        this.repeatedAdapter = pVar;
    }

    public abstract E d(n reader) throws IOException;

    public abstract void e(o writer, E value) throws IOException;

    public abstract int g(E value);

    static {
        ProtoAdapter<Duration> c1986a;
        ProtoAdapter<Instant> c1986a2;
        ProtoAdapter<Boolean> protoAdapterA = m.a();
        f126637j = protoAdapterA;
        ProtoAdapter<Integer> protoAdapterJ = m.j();
        f126638k = protoAdapterJ;
        f126639l = new g(protoAdapterJ);
        ProtoAdapter<Integer> protoAdapterU = m.u();
        f126640m = protoAdapterU;
        f126641n = new g(protoAdapterU);
        ProtoAdapter<Integer> protoAdapterN = m.n();
        f126642o = protoAdapterN;
        f126643p = new g(protoAdapterN);
        ProtoAdapter<Integer> protoAdapterF = m.f();
        f126644q = protoAdapterF;
        f126645r = new g(protoAdapterF);
        ProtoAdapter<Integer> protoAdapterL = m.l();
        f126646s = protoAdapterL;
        f126647t = new g(protoAdapterL);
        ProtoAdapter<Long> protoAdapterK = m.k();
        f126648u = protoAdapterK;
        f126649v = new h(protoAdapterK);
        ProtoAdapter<Long> protoAdapterV = m.v();
        f126650w = protoAdapterV;
        f126651x = new h(protoAdapterV);
        ProtoAdapter<Long> protoAdapterO = m.o();
        f126652y = protoAdapterO;
        f126653z = new h(protoAdapterO);
        ProtoAdapter<Long> protoAdapterG = m.g();
        f126610A = protoAdapterG;
        f126611B = new h(protoAdapterG);
        ProtoAdapter<Long> protoAdapterM = m.m();
        f126612C = protoAdapterM;
        f126613D = new h(protoAdapterM);
        f fVarH = m.h();
        f126614E = fVarH;
        f126615F = new e(fVarH);
        b bVarC = m.c();
        f126616G = bVarC;
        f126617H = new C15501a(bVarC);
        ProtoAdapter<C15331h> protoAdapterB = m.b();
        f126618I = protoAdapterB;
        ProtoAdapter<String> protoAdapterP = m.p();
        f126619J = protoAdapterP;
        f126620K = m.e();
        f126621L = m.r();
        f126622M = m.q();
        f126623N = m.s();
        f126624O = m.t();
        f126625P = m.w(bVarC, "type.googleapis.com/google.protobuf.DoubleValue");
        f126626Q = m.w(fVarH, "type.googleapis.com/google.protobuf.FloatValue");
        f126627R = m.w(protoAdapterK, "type.googleapis.com/google.protobuf.Int64Value");
        f126628S = m.w(protoAdapterV, "type.googleapis.com/google.protobuf.UInt64Value");
        f126629T = m.w(protoAdapterJ, "type.googleapis.com/google.protobuf.Int32Value");
        f126630U = m.w(protoAdapterU, "type.googleapis.com/google.protobuf.UInt32Value");
        f126631V = m.w(protoAdapterA, "type.googleapis.com/google.protobuf.BoolValue");
        f126632W = m.w(protoAdapterP, "type.googleapis.com/google.protobuf.StringValue");
        f126633X = m.w(protoAdapterB, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            c1986a = m.d();
        } catch (NoClassDefFoundError unused) {
            c1986a = new Companion.C1986a();
        }
        f126634Y = c1986a;
        try {
            c1986a2 = m.i();
        } catch (NoClassDefFoundError unused2) {
            c1986a2 = new Companion.C1986a();
        }
        f126635Z = c1986a2;
    }

    public final ProtoAdapter<List<E>> a() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public final E b(InputStream stream) throws IOException {
        Intrinsics.j(stream, "stream");
        return c(w.d(w.k(stream)));
    }

    public final E c(InterfaceC15330g source) throws IOException {
        Intrinsics.j(source, "source");
        return d(new n(source));
    }

    public void f(o writer, int tag, E value) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value != null) {
            writer.f(tag, getFieldEncoding());
            if (getFieldEncoding() == d.f149408e) {
                writer.g(g(value));
            }
            e(writer, value);
        }
    }

    public int h(int tag, E value) {
        if (value == null) {
            return 0;
        }
        int iG = g(value);
        if (getFieldEncoding() == d.f149408e) {
            iG += o.INSTANCE.h(iG);
        }
        return iG + o.INSTANCE.g(tag);
    }

    /* renamed from: i, reason: from getter */
    public final d getFieldEncoding() {
        return this.fieldEncoding;
    }

    public final E j() {
        return this.identity;
    }

    /* renamed from: k, reason: from getter */
    public final q getSyntax() {
        return this.syntax;
    }

    public final KClass<?> l() {
        return this.type;
    }

    public /* synthetic */ ProtoAdapter(d dVar, KClass kClass, String str, q qVar, Object obj, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, kClass, str, qVar, (i10 & 16) != 0 ? null : obj, (i10 & 32) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(d fieldEncoding, KClass<?> kClass) {
        this(fieldEncoding, kClass, null, q.f149439c);
        Intrinsics.j(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(d fieldEncoding, KClass<?> kClass, String str, q syntax) {
        this(fieldEncoding, kClass, str, syntax, null);
        Intrinsics.j(fieldEncoding, "fieldEncoding");
        Intrinsics.j(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(d fieldEncoding, KClass<?> kClass, String str, q syntax, E e10) {
        this(fieldEncoding, kClass, str, syntax, e10, null);
        Intrinsics.j(fieldEncoding, "fieldEncoding");
        Intrinsics.j(syntax, "syntax");
    }
}
