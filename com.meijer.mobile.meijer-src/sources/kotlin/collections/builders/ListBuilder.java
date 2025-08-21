package kotlin.collections.builders;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\"\b\u0000\u0018\u0000 `*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003WZaB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010%J\u001d\u0010(\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010#J\u001d\u0010/\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b0\u0010)J%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J)\u00108\u001a\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0001\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016¢\u0006\u0004\b8\u0010;J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010:H\u0096\u0002¢\u0006\u0004\b=\u0010#J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020$H\u0002¢\u0006\u0004\bC\u0010,J\u000f\u0010D\u001a\u00020$H\u0002¢\u0006\u0004\bD\u0010,J\u0017\u0010F\u001a\u00020$2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010\u000bJ\u0017\u0010H\u001a\u00020$2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010I\u001a\u00020\u000f2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010\u0001\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0001\u0010LJ\u001f\u0010M\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bM\u0010%J-\u0010N\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00028\u00002\u0006\u0010K\u001a\u00020\bH\u0002¢\u0006\u0004\bP\u0010\u0014J\u001f\u0010S\u001a\u00020$2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002¢\u0006\u0004\bS\u0010LJ5\u0010U\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010T\u001a\u00020\u000fH\u0002¢\u0006\u0004\bU\u0010VR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010UR\u0016\u0010^\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010?¨\u0006b"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "x", "()Ljava/util/List;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "f", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "y", "n", "D", "minCapacity", "C", "B", "(Ljava/util/List;)Z", "i", "(II)V", "v", "u", "(ILjava/util/Collection;I)V", "G", "rangeOffset", "rangeLength", "H", "retain", "I", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "backing", "b", "length", "c", "Z", "isReadOnly", "size", "d", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {

    /* renamed from: d, reason: collision with root package name */
    private static final a f143454d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final ListBuilder f143455e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private E[] backing;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001c\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001XBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\bH\u0016¢\u0006\u0004\b:\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010<H\u0096\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010/J\u000f\u0010F\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010/J\u000f\u0010G\u001a\u00020'H\u0002¢\u0006\u0004\bG\u0010/J\u001b\u0010I\u001a\u00020\u00122\n\u0010>\u001a\u0006\u0012\u0002\b\u00030HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\bL\u0010(J-\u0010N\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010M\u001a\u00020\nH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bP\u0010\u0017J\u001f\u0010S\u001a\u00020'2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010TJ5\u0010V\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010U\u001a\u00020\u0012H\u0002¢\u0006\u0004\bV\u0010WR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010AR\u0014\u0010c\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u0014¨\u0006d"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "Lkotlin/collections/builders/ListBuilder;", "root", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "f", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "x", "s", "t", "", "u", "(Ljava/util/List;)Z", "i", "r", "n", "q", "(ILjava/util/Collection;I)V", "y", "rangeOffset", "rangeLength", "B", "(II)V", "retain", "C", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "b", "I", "c", "d", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "e", "Lkotlin/collections/builders/ListBuilder;", "size", "v", "isReadOnly", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private E[] backing;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int offset;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final BuilderSubList<E> parent;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final ListBuilder<E> root;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$a;", "E", "", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "list", "", "index", "<init>", "(Lkotlin/collections/builders/ListBuilder$BuilderSubList;I)V", "", "a", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "b", "I", "c", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        private static final class a<E> implements ListIterator<E>, KMutableListIterator {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final BuilderSubList<E> list;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private int index;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int lastIndex;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int expectedModCount;

            public a(BuilderSubList<E> list, int i10) {
                Intrinsics.j(list, "list");
                this.list = list;
                this.index = i10;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) list).modCount;
            }

            private final void a() {
                if (((AbstractList) ((BuilderSubList) this.list).root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < ((BuilderSubList) this.list).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator
            public void add(E element) {
                a();
                BuilderSubList<E> builderSubList = this.list;
                int i10 = this.index;
                this.index = i10 + 1;
                builderSubList.add(i10, element);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                a();
                if (this.index < ((BuilderSubList) this.list).length) {
                    int i10 = this.index;
                    this.index = i10 + 1;
                    this.lastIndex = i10;
                    return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public E previous() {
                a();
                int i10 = this.index;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.index = i11;
                    this.lastIndex = i11;
                    return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.lastIndex;
                if (i10 != -1) {
                    this.list.remove(i10);
                    this.index = this.lastIndex;
                    this.lastIndex = -1;
                    this.expectedModCount = ((AbstractList) this.list).modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            @Override // java.util.ListIterator
            public void set(E element) {
                a();
                int i10 = this.lastIndex;
                if (i10 != -1) {
                    this.list.set(i10, element);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            t();
            s();
            r(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> elements) {
            Intrinsics.j(elements, "elements");
            t();
            s();
            int size = elements.size();
            q(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            Intrinsics.j(array, "array");
            s();
            int length = array.length;
            int i10 = this.length;
            if (length >= i10) {
                E[] eArr = this.backing;
                int i11 = this.offset;
                ArraysKt.o(eArr, array, 0, i11, i10 + i11);
                return (T[]) CollectionsKt.f(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i12 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i12, i10 + i12, array.getClass());
            Intrinsics.i(tArr, "copyOfRange(...)");
            return tArr;
        }

        public BuilderSubList(E[] backing, int i10, int i11, BuilderSubList<E> builderSubList, ListBuilder<E> root) {
            Intrinsics.j(backing, "backing");
            Intrinsics.j(root, "root");
            this.backing = backing;
            this.offset = i10;
            this.length = i11;
            this.parent = builderSubList;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void B(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                x();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.B(rangeOffset, rangeLength);
            } else {
                this.root.H(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        private final int C(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
            BuilderSubList<E> builderSubList = this.parent;
            int iC = builderSubList != null ? builderSubList.C(rangeOffset, rangeLength, elements, retain) : this.root.I(rangeOffset, rangeLength, elements, retain);
            if (iC > 0) {
                x();
            }
            this.length -= iC;
            return iC;
        }

        private final void s() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final boolean u(List<?> other) {
            return ListBuilderKt.h(this.backing, this.offset, this.length, other);
        }

        private final boolean v() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        private final void x() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            s();
            kotlin.collections.AbstractList.INSTANCE.c(index, this.length);
            return new a(this, index);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> elements) {
            Intrinsics.j(elements, "elements");
            t();
            s();
            return C(this.offset, this.length, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> elements) {
            Intrinsics.j(elements, "elements");
            t();
            s();
            return C(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            kotlin.collections.AbstractList.INSTANCE.d(fromIndex, toIndex, this.length);
            return new BuilderSubList(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        private final void q(int i10, Collection<? extends E> elements, int n10) {
            x();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                this.root.u(i10, elements, n10);
            } else {
                builderSubList.q(i10, elements, n10);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += n10;
        }

        private final void r(int i10, E element) {
            x();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                this.root.v(i10, element);
            } else {
                builderSubList.r(i10, element);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        private final void t() {
            if (!v()) {
            } else {
                throw new UnsupportedOperationException();
            }
        }

        private final E y(int i10) {
            E eY;
            x();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                eY = (E) this.root.G(i10);
            } else {
                eY = builderSubList.y(i10);
            }
            this.length--;
            return eY;
        }

        @Override // kotlin.collections.AbstractMutableList
        /* renamed from: a */
        public int getLength() {
            s();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            t();
            s();
            B(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object other) {
            s();
            if (other != this) {
                if (!(other instanceof List) || !u((List) other)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // kotlin.collections.AbstractMutableList
        public E f(int index) {
            t();
            s();
            kotlin.collections.AbstractList.INSTANCE.b(index, this.length);
            return y(this.offset + index);
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            s();
            kotlin.collections.AbstractList.INSTANCE.b(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            s();
            return ListBuilderKt.i(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            s();
            for (int i10 = 0; i10 < this.length; i10++) {
                if (Intrinsics.e(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            s();
            if (this.length == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            s();
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (Intrinsics.e(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            t();
            s();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            if (iIndexOf >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            t();
            s();
            kotlin.collections.AbstractList.INSTANCE.b(index, this.length);
            E[] eArr = this.backing;
            int i10 = this.offset;
            E e10 = eArr[i10 + index];
            eArr[i10 + index] = element;
            return e10;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            s();
            return ListBuilderKt.j(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            t();
            s();
            kotlin.collections.AbstractList.INSTANCE.c(index, this.length);
            r(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> elements) {
            Intrinsics.j(elements, "elements");
            t();
            s();
            kotlin.collections.AbstractList.INSTANCE.c(index, this.length);
            int size = elements.size();
            q(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            s();
            E[] eArr = this.backing;
            int i10 = this.offset;
            return ArraysKt.w(eArr, i10, this.length + i10);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/ListBuilder$a;", "", "<init>", "()V", "Lkotlin/collections/builders/ListBuilder;", "", "Empty", "Lkotlin/collections/builders/ListBuilder;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lkotlin/collections/builders/ListBuilder$b;", "E", "", "Lkotlin/collections/builders/ListBuilder;", "list", "", "index", "<init>", "(Lkotlin/collections/builders/ListBuilder;I)V", "", "a", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lkotlin/collections/builders/ListBuilder;", "b", "I", "c", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class b<E> implements ListIterator<E>, KMutableListIterator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ListBuilder<E> list;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int lastIndex;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public b(ListBuilder<E> list, int i10) {
            Intrinsics.j(list, "list");
            this.list = list;
            this.index = i10;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((ListBuilder) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            a();
            ListBuilder<E> listBuilder = this.list;
            int i10 = this.index;
            this.index = i10 + 1;
            listBuilder.add(i10, element);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            if (this.index < ((ListBuilder) this.list).length) {
                int i10 = this.index;
                this.index = i10 + 1;
                this.lastIndex = i10;
                return (E) ((ListBuilder) this.list).backing[this.lastIndex];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i10 = this.index;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.index = i11;
                this.lastIndex = i11;
                return (E) ((ListBuilder) this.list).backing[this.lastIndex];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.lastIndex;
            if (i10 != -1) {
                this.list.remove(i10);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            a();
            int i10 = this.lastIndex;
            if (i10 != -1) {
                this.list.set(i10, element);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < rangeLength) {
            int i12 = rangeOffset + i10;
            if (elements.contains(this.backing[i12]) == retain) {
                E[] eArr = this.backing;
                i10++;
                eArr[i11 + rangeOffset] = eArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = rangeLength - i11;
        E[] eArr2 = this.backing;
        ArraysKt.o(eArr2, eArr2, rangeOffset + i11, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i14 = this.length;
        ListBuilderKt.g(eArr3, i14 - i13, i14);
        if (i13 > 0) {
            F();
        }
        this.length -= i13;
        return i13;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        y();
        v(this.length, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        y();
        int size = elements.size();
        u(this.length, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (Intrinsics.e(this.backing[i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.j(array, "array");
        int length = array.length;
        int i10 = this.length;
        if (length >= i10) {
            ArraysKt.o(this.backing, array, 0, 0, i10);
            return (T[]) CollectionsKt.f(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i10, array.getClass());
        Intrinsics.i(tArr, "copyOfRange(...)");
        return tArr;
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        f143455e = listBuilder;
    }

    public ListBuilder(int i10) {
        this.backing = (E[]) ListBuilderKt.d(i10);
    }

    private final boolean B(List<?> other) {
        return ListBuilderKt.h(this.backing, 0, this.length, other);
    }

    private final void C(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) ListBuilderKt.e(this.backing, kotlin.collections.AbstractList.INSTANCE.e(eArr.length, minCapacity));
        }
    }

    private final void D(int n10) {
        C(this.length + n10);
    }

    private final void F() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            F();
        }
        E[] eArr = this.backing;
        ArraysKt.o(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i10 = this.length;
        ListBuilderKt.g(eArr2, i10 - rangeLength, i10);
        this.length -= rangeLength;
    }

    private final void y() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: a, reason: from getter */
    public int getLength() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof List) && B((List) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        kotlin.collections.AbstractList.INSTANCE.b(index, this.length);
        return this.backing[index];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return ListBuilderKt.i(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i10 = this.length - 1; i10 >= 0; i10--) {
            if (Intrinsics.e(this.backing[i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        kotlin.collections.AbstractList.INSTANCE.c(index, this.length);
        return new b(this, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        Intrinsics.j(elements, "elements");
        y();
        return I(0, this.length, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        Intrinsics.j(elements, "elements");
        y();
        return I(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        kotlin.collections.AbstractList.INSTANCE.d(fromIndex, toIndex, this.length);
        return new BuilderSubList(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return ListBuilderKt.j(this.backing, 0, this.length, this);
    }

    private final void E(int i10, int n10) {
        D(n10);
        E[] eArr = this.backing;
        ArraysKt.o(eArr, eArr, i10 + n10, i10, this.length);
        this.length += n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E G(int i10) {
        F();
        E[] eArr = this.backing;
        E e10 = eArr[i10];
        ArraysKt.o(eArr, eArr, i10, i10 + 1, this.length);
        ListBuilderKt.f(this.backing, this.length - 1);
        this.length--;
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i10, Collection<? extends E> elements, int n10) {
        F();
        E(i10, n10);
        Iterator<? extends E> it = elements.iterator();
        for (int i11 = 0; i11 < n10; i11++) {
            this.backing[i10 + i11] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i10, E element) {
        F();
        E(i10, 1);
        this.backing[i10] = element;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        y();
        kotlin.collections.AbstractList.INSTANCE.c(index, this.length);
        v(index, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        y();
        H(0, this.length);
    }

    @Override // kotlin.collections.AbstractMutableList
    public E f(int index) {
        y();
        kotlin.collections.AbstractList.INSTANCE.b(index, this.length);
        return G(index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        y();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        if (iIndexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        y();
        kotlin.collections.AbstractList.INSTANCE.b(index, this.length);
        E[] eArr = this.backing;
        E e10 = eArr[index];
        eArr[index] = element;
        return e10;
    }

    public final List<E> x() {
        y();
        this.isReadOnly = true;
        if (this.length > 0) {
            return this;
        }
        return f143455e;
    }

    public /* synthetic */ ListBuilder(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        y();
        kotlin.collections.AbstractList.INSTANCE.c(index, this.length);
        int size = elements.size();
        u(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return ArraysKt.w(this.backing, 0, this.length);
    }
}
