package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.y;
import androidx.view.AbstractC6023l;
import androidx.view.F;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6029r;
import androidx.view.InterfaceC6030s;
import androidx.view.g0;
import com.fullstory.FS;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import j2.C14835c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC14653B;
import kotlin.C14664h;
import kotlin.C14668l;
import kotlin.C14671o;
import kotlin.C14672p;
import kotlin.C14679w;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import sv.EnumC17050a;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 Í\u00012\u00020\u0001:\u0006\u008c\u0001\u0091\u0001\u0095\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJb\u0010\u0019\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJP\u0010\u001e\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u001c2\u0010\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000e2\u0006\u0010*\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b+\u0010,J1\u00100\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001cH\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u001cH\u0002¢\u0006\u0004\b7\u00105J\u0019\u0010:\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u0004\u0018\u00010%2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u0004\u0018\u00010\r*\u00020\r2\b\b\u0001\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b@\u0010AJ5\u0010D\u001a\u00020\t2\u0006\u0010B\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\bF\u0010GJ5\u0010I\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bI\u0010JJ;\u0010K\u001a\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010C\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bK\u0010LJ%\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0002¢\u0006\u0004\bN\u0010OJ9\u0010R\u001a\u00020\t2\u0006\u0010B\u001a\u00020\r2\b\u0010P\u001a\u0004\u0018\u0001082\u0006\u0010\u0017\u001a\u00020\u00062\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010V\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u001cH\u0017¢\u0006\u0004\bX\u00105J!\u0010Y\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0017¢\u0006\u0004\bY\u0010ZJ)\u0010[\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b[\u0010$J%\u0010^\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\t0\\H\u0000¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u001cH\u0017¢\u0006\u0004\b`\u00105J\u000f\u0010a\u001a\u00020\tH\u0000¢\u0006\u0004\ba\u0010UJ\u0015\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\bb\u0010cJ!\u0010f\u001a\u00020\t2\u0006\u0010e\u001a\u00020d2\b\u00109\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0004\bf\u0010gJ\u0019\u0010j\u001a\u00020\u001c2\b\u0010i\u001a\u0004\u0018\u00010hH\u0017¢\u0006\u0004\bj\u0010kJ\u001b\u0010l\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\bl\u0010mJ+\u0010p\u001a\u00020\t2\u0006\u0010o\u001a\u00020n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\bp\u0010qJ0\u0010u\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0017\u0010t\u001a\u0013\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0002\bsH\u0007¢\u0006\u0004\bu\u0010vJ/\u0010w\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\bw\u0010xJ\u000f\u0010z\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u0011\u0010|\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0004\b|\u0010}J\u0019\u0010\u007f\u001a\u00020\t2\b\u0010~\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0004\b\u007f\u0010;J\u001c\u0010\u0082\u0001\u001a\u00020\t2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\t2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0017¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020 H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0018\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R#\u0010¢\u0001\u001a\f\u0012\u0005\u0012\u00030\u009f\u0001\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¤\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010[R\u001d\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R$\u0010«\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R,\u0010±\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¬\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R$\u0010³\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010ª\u0001R)\u0010¶\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¬\u00018\u0006¢\u0006\u0010\n\u0006\b´\u0001\u0010®\u0001\u001a\u0006\bµ\u0001\u0010°\u0001R$\u0010º\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R%\u0010½\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030»\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R&\u0010¿\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010%0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¹\u0001R)\u0010À\u0001\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0·\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bR\u0010¹\u0001R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001b\u0010Æ\u0001\u001a\u0005\u0018\u00010Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010Å\u0001R\u001e\u0010Ê\u0001\u001a\n\u0012\u0005\u0012\u00030È\u00010Ç\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bz\u0010É\u0001R)\u0010Ñ\u0001\u001a\u00030Ë\u00018@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b7\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R\u0017\u0010Ô\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010Ó\u0001R\u0017\u0010×\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010Ö\u0001R\u0017\u0010Ø\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010[R\u0019\u0010Û\u0001\u001a\u00030Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010Ú\u0001R0\u0010Ý\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\t\u0012\u00070Ü\u0001R\u00020\u00000·\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b>\u0010¹\u0001R6\u0010ß\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010Þ\u0001R6\u0010à\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010Þ\u0001R$\u0010á\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010¹\u0001R\u0019\u0010ä\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001e\u0010è\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R!\u0010í\u0001\u001a\u00030\u0094\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R\u001e\u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R#\u0010ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060ò\u00018\u0006¢\u0006\u0010\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bæ\u0001\u0010õ\u0001R\u0017\u0010ø\u0001\u001a\u00020 8BX\u0082\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010÷\u0001R(\u0010e\u001a\u00020d2\u0006\u0010e\u001a\u00020d8W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bó\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R,\u0010ü\u0001\u001a\u00030Ù\u00012\b\u0010ü\u0001\u001a\u00030Ù\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bã\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R\u0019\u0010\u0081\u0002\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010\u0080\u0002R\u0019\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010\u0082\u0002¨\u0006\u0084\u0002"}, d2 = {"Li4/k;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Li4/h;", "child", "parent", "", "O", "(Li4/h;Li4/h;)V", "Li4/B;", "Li4/p;", "", "entries", "Li4/w;", "navOptions", "Li4/B$a;", "navigatorExtras", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "backStackEntry", "handler", "U", "(Li4/B;Ljava/util/List;Li4/w;Li4/B$a;Lkotlin/jvm/functions/Function1;)V", "popUpTo", "", "saveState", "b0", "(Li4/B;Li4/h;ZLkotlin/jvm/functions/Function1;)V", "", "destinationId", "inclusive", "c0", "(IZZ)Z", "", PlaceTypes.ROUTE, "d0", "(Ljava/lang/String;ZZ)Z", "popOperations", "foundDestination", "u", "(Ljava/util/List;Li4/p;ZZ)Z", "Lkotlin/collections/ArrayDeque;", "Li4/i;", "savedState", "f0", "(Li4/h;ZLkotlin/collections/ArrayDeque;)V", "r", "(I)Z", "p0", "()Z", "q0", "t", "Landroid/os/Bundle;", "startDestinationArgs", "W", "(Landroid/os/Bundle;)V", "", "deepLink", "y", "([I)Ljava/lang/String;", "x", "(Li4/p;I)Li4/p;", "node", "args", "Q", "(Li4/p;Landroid/os/Bundle;Li4/w;Li4/B$a;)V", "M", "(Li4/p;Landroid/os/Bundle;)Z", PreferencesHelper.PREF_ID, "j0", "(ILandroid/os/Bundle;Li4/w;Li4/B$a;)Z", "v", "(Ljava/util/List;Landroid/os/Bundle;Li4/w;Li4/B$a;)Z", "backStackState", "L", "(Lkotlin/collections/ArrayDeque;)Ljava/util/List;", "finalArgs", "restoredEntries", "p", "(Li4/p;Landroid/os/Bundle;Li4/h;Ljava/util/List;)V", "t0", "()V", "r0", "(Li4/h;)Li4/h;", "X", "Y", "(IZ)Z", "Z", "Lkotlin/Function0;", "onComplete", "a0", "(Li4/h;Lkotlin/jvm/functions/Function0;)V", "V", "s0", "h0", "()Ljava/util/List;", "Li4/r;", "graph", "m0", "(Li4/r;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "K", "(Landroid/content/Intent;)Z", "w", "(I)Li4/p;", "Li4/o;", "request", "P", "(Li4/o;Li4/w;Li4/B$a;)V", "Li4/x;", "Lkotlin/ExtensionFunctionType;", "builder", "S", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "R", "(Ljava/lang/String;Li4/w;Li4/B$a;)V", "Li4/n;", "s", "()Li4/n;", "k0", "()Landroid/os/Bundle;", "navState", "i0", "Landroidx/lifecycle/s;", "owner", "n0", "(Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/g0;", "viewModelStore", "o0", "(Landroidx/lifecycle/g0;)V", "z", "(I)Li4/h;", "A", "(Ljava/lang/String;)Li4/h;", "a", "Landroid/content/Context;", "B", "()Landroid/content/Context;", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "Li4/v;", "c", "Li4/v;", "inflater", "d", "Li4/r;", "_graph", "e", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "f", "[Landroid/os/Parcelable;", "backStackToRestore", "g", "deepLinkHandled", "h", "Lkotlin/collections/ArrayDeque;", "backQueue", "Ltv/B;", "i", "Ltv/B;", "_currentBackStack", "Ltv/P;", "j", "Ltv/P;", "getCurrentBackStack", "()Ltv/P;", "currentBackStack", "k", "_visibleEntries", "l", "J", "visibleEntries", "", "m", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", "n", "parentToChildCount", "o", "backStackMap", "backStackStates", "q", "Landroidx/lifecycle/s;", "lifecycleOwner", "Li4/l;", "Li4/l;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Li4/k$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/l$b;", "Landroidx/lifecycle/l$b;", "H", "()Landroidx/lifecycle/l$b;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/l$b;)V", "hostLifecycleState", "Landroidx/lifecycle/r;", "Landroidx/lifecycle/r;", "lifecycleObserver", "Landroidx/activity/F;", "Landroidx/activity/F;", "onBackPressedCallback", "enableOnBackPressedCallback", "Li4/C;", "Li4/C;", "_navigatorProvider", "Li4/k$b;", "navigatorState", "Lkotlin/jvm/functions/Function1;", "addToBackStackHandler", "popFromBackStackHandler", "entrySavedState", "C", "I", "dispatchReentrantCount", "", "D", "Ljava/util/List;", "backStackEntriesToDispatch", "E", "Lkotlin/Lazy;", "getNavInflater", "()Li4/v;", "navInflater", "Ltv/A;", "F", "Ltv/A;", "_currentBackStackEntryFlow", "Ltv/f;", "G", "Ltv/f;", "()Ltv/f;", "currentBackStackEntryFlow", "()I", "destinationCountOnBackStack", "()Li4/r;", "l0", "(Li4/r;)V", "navigatorProvider", "()Li4/C;", "setNavigatorProvider", "(Li4/C;)V", "()Li4/p;", "currentDestination", "()Li4/h;", "currentBackStackEntry", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14667k {

    /* renamed from: I, reason: collision with root package name */
    private static boolean f137256I = true;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C14664h, Unit> popFromBackStackHandler;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Map<C14664h, Boolean> entrySavedState;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int dispatchReentrantCount;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final List<C14664h> backStackEntriesToDispatch;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy navInflater;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<C14664h> _currentBackStackEntryFlow;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17152f<C14664h> currentBackStackEntryFlow;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Activity activity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C14678v inflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C14674r _graph;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Bundle navigatorStateToRestore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Parcelable[] backStackToRestore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean deepLinkHandled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<C14664h> backQueue;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<List<C14664h>> _currentBackStack;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final P<List<C14664h>> currentBackStack;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<List<C14664h>> _visibleEntries;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final P<List<C14664h>> visibleEntries;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Map<C14664h, C14664h> childToParentEntries;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Map<C14664h, AtomicInteger> parentToChildCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, String> backStackMap;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Map<String, ArrayDeque<C14665i>> backStackStates;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6030s lifecycleOwner;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private C14668l viewModel;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<c> onDestinationChangedListeners;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AbstractC6023l.b hostLifecycleState;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6029r lifecycleObserver;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final F onBackPressedCallback;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean enableOnBackPressedCallback;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C14654C _navigatorProvider;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Map<AbstractC14653B<? extends C14672p>, b> navigatorState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C14664h, Unit> addToBackStackHandler;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Li4/k$b;", "Li4/D;", "Li4/B;", "Li4/p;", "navigator", "<init>", "(Li4/k;Li4/B;)V", "Li4/h;", "backStackEntry", "", "i", "(Li4/h;)V", "m", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Li4/p;Landroid/os/Bundle;)Li4/h;", "popUpTo", "", "saveState", "g", "(Li4/h;Z)V", "h", "entry", "e", "Li4/B;", "getNavigator", "()Li4/B;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: i4.k$b */
    private final class b extends AbstractC14655D {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final AbstractC14653B<? extends C14672p> navigator;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C14667k f137291h;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: i4.k$b$a */
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C14664h f137293g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f137294h;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C14664h c14664h, boolean z10) {
                super(0);
                this.f137293g = c14664h;
                this.f137294h = z10;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.super.g(this.f137293g, this.f137294h);
            }
        }

        public b(C14667k c14667k, AbstractC14653B<? extends C14672p> navigator) {
            Intrinsics.j(navigator, "navigator");
            this.f137291h = c14667k;
            this.navigator = navigator;
        }

        @Override // kotlin.AbstractC14655D
        public C14664h a(C14672p destination, Bundle arguments) {
            Intrinsics.j(destination, "destination");
            return C14664h.Companion.b(C14664h.INSTANCE, this.f137291h.getContext(), destination, arguments, this.f137291h.H(), this.f137291h.viewModel, null, null, 96, null);
        }

        @Override // kotlin.AbstractC14655D
        public void e(C14664h entry) {
            C14668l c14668l;
            Intrinsics.j(entry, "entry");
            boolean zE = Intrinsics.e(this.f137291h.entrySavedState.get(entry), Boolean.TRUE);
            super.e(entry);
            this.f137291h.entrySavedState.remove(entry);
            if (this.f137291h.backQueue.contains(entry)) {
                if (getIsNavigating()) {
                    return;
                }
                this.f137291h.s0();
                this.f137291h._currentBackStack.b(CollectionsKt.m1(this.f137291h.backQueue));
                this.f137291h._visibleEntries.b(this.f137291h.h0());
                return;
            }
            this.f137291h.r0(entry);
            if (entry.getLifecycle().getState().b(AbstractC6023l.b.f55277c)) {
                entry.k(AbstractC6023l.b.f55275a);
            }
            ArrayDeque arrayDeque = this.f137291h.backQueue;
            if (arrayDeque == null || !arrayDeque.isEmpty()) {
                Iterator<E> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.e(((C14664h) it.next()).getId(), entry.getId())) {
                        break;
                    }
                }
                if (!zE && (c14668l = this.f137291h.viewModel) != null) {
                    c14668l.n(entry.getId());
                }
            } else if (!zE) {
                c14668l.n(entry.getId());
            }
            this.f137291h.s0();
            this.f137291h._visibleEntries.b(this.f137291h.h0());
        }

        @Override // kotlin.AbstractC14655D
        public void g(C14664h popUpTo, boolean saveState) throws Resources.NotFoundException {
            Intrinsics.j(popUpTo, "popUpTo");
            AbstractC14653B abstractC14653BE = this.f137291h._navigatorProvider.e(popUpTo.getDestination().getNavigatorName());
            if (!Intrinsics.e(abstractC14653BE, this.navigator)) {
                Object obj = this.f137291h.navigatorState.get(abstractC14653BE);
                Intrinsics.g(obj);
                ((b) obj).g(popUpTo, saveState);
            } else {
                Function1 function1 = this.f137291h.popFromBackStackHandler;
                if (function1 == null) {
                    this.f137291h.a0(popUpTo, new a(popUpTo, saveState));
                } else {
                    function1.invoke(popUpTo);
                    super.g(popUpTo, saveState);
                }
            }
        }

        @Override // kotlin.AbstractC14655D
        public void h(C14664h popUpTo, boolean saveState) {
            Intrinsics.j(popUpTo, "popUpTo");
            super.h(popUpTo, saveState);
            this.f137291h.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
        }

        @Override // kotlin.AbstractC14655D
        public void i(C14664h backStackEntry) {
            Intrinsics.j(backStackEntry, "backStackEntry");
            AbstractC14653B abstractC14653BE = this.f137291h._navigatorProvider.e(backStackEntry.getDestination().getNavigatorName());
            if (!Intrinsics.e(abstractC14653BE, this.navigator)) {
                Object obj = this.f137291h.navigatorState.get(abstractC14653BE);
                if (obj != null) {
                    ((b) obj).i(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            Function1 function1 = this.f137291h.addToBackStackHandler;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                m(backStackEntry);
                return;
            }
            FS.log_i("NavController", "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
        }

        public final void m(C14664h backStackEntry) {
            Intrinsics.j(backStackEntry, "backStackEntry");
            super.i(backStackEntry);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Li4/k$c;", "", "Li4/k;", "controller", "Li4/p;", "destination", "Landroid/os/Bundle;", "arguments", "", "a", "(Li4/k;Li4/p;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.k$c */
    public interface c {
        void a(C14667k controller, C14672p destination, Bundle arguments);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$d */
    static final class d extends Lambda implements Function1<Context, Context> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f137295f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            Intrinsics.j(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/x;", "", "a", "(Li4/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$e */
    static final class e extends Lambda implements Function1<C14680x, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f137296f = new e();

        e() {
            super(1);
        }

        public final void a(C14680x navOptions) {
            Intrinsics.j(navOptions, "$this$navOptions");
            navOptions.i(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14680x c14680x) {
            a(c14680x);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/h;", "entry", "", "a", "(Li4/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$f */
    static final class f extends Lambda implements Function1<C14664h, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f137297f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f137298g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C14667k f137299h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f137300i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayDeque<C14665i> f137301j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, C14667k c14667k, boolean z10, ArrayDeque<C14665i> arrayDeque) {
            super(1);
            this.f137297f = booleanRef;
            this.f137298g = booleanRef2;
            this.f137299h = c14667k;
            this.f137300i = z10;
            this.f137301j = arrayDeque;
        }

        public final void a(C14664h entry) {
            Intrinsics.j(entry, "entry");
            this.f137297f.f142828a = true;
            this.f137298g.f142828a = true;
            this.f137299h.f0(entry, this.f137300i, this.f137301j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14664h c14664h) {
            a(c14664h);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/p;", "destination", "a", "(Li4/p;)Li4/p;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$g */
    static final class g extends Lambda implements Function1<C14672p, C14672p> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f137302f = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C14672p invoke(C14672p destination) {
            Intrinsics.j(destination, "destination");
            C14674r parent = destination.getParent();
            if (parent == null || parent.getStartDestId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/p;", "destination", "", "a", "(Li4/p;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$h */
    static final class h extends Lambda implements Function1<C14672p, Boolean> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C14672p destination) {
            Intrinsics.j(destination, "destination");
            return Boolean.valueOf(!C14667k.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/p;", "destination", "a", "(Li4/p;)Li4/p;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$i */
    static final class i extends Lambda implements Function1<C14672p, C14672p> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f137304f = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C14672p invoke(C14672p destination) {
            Intrinsics.j(destination, "destination");
            C14674r parent = destination.getParent();
            if (parent == null || parent.getStartDestId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/p;", "destination", "", "a", "(Li4/p;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$j */
    static final class j extends Lambda implements Function1<C14672p, Boolean> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C14672p destination) {
            Intrinsics.j(destination, "destination");
            return Boolean.valueOf(!C14667k.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/h;", "entry", "", "a", "(Li4/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$k, reason: collision with other inner class name */
    static final class C2165k extends Lambda implements Function1<C14664h, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f137306f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<C14664h> f137307g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f137308h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C14667k f137309i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Bundle f137310j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2165k(Ref.BooleanRef booleanRef, List<C14664h> list, Ref.IntRef intRef, C14667k c14667k, Bundle bundle) {
            super(1);
            this.f137306f = booleanRef;
            this.f137307g = list;
            this.f137308h = intRef;
            this.f137309i = c14667k;
            this.f137310j = bundle;
        }

        public final void a(C14664h entry) {
            List<C14664h> listM;
            Intrinsics.j(entry, "entry");
            this.f137306f.f142828a = true;
            int iIndexOf = this.f137307g.indexOf(entry);
            if (iIndexOf != -1) {
                int i10 = iIndexOf + 1;
                listM = this.f137307g.subList(this.f137308h.f142833a, i10);
                this.f137308h.f142833a = i10;
            } else {
                listM = CollectionsKt.m();
            }
            this.f137309i.p(entry.getDestination(), this.f137310j, entry, listM);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14664h c14664h) {
            a(c14664h);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/x;", "", "a", "(Li4/x;)V"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: i4.k$l */
    static final class l extends Lambda implements Function1<C14680x, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14672p f137311f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C14667k f137312g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/b;", "", "a", "(Li4/b;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: i4.k$l$a */
        static final class a extends Lambda implements Function1<C14658b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f137313f = new a();

            a() {
                super(1);
            }

            public final void a(C14658b anim) {
                Intrinsics.j(anim, "$this$anim");
                anim.e(0);
                anim.f(0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C14658b c14658b) {
                a(c14658b);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/E;", "", "a", "(Li4/E;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: i4.k$l$b */
        static final class b extends Lambda implements Function1<C14656E, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final b f137314f = new b();

            b() {
                super(1);
            }

            public final void a(C14656E popUpTo) {
                Intrinsics.j(popUpTo, "$this$popUpTo");
                popUpTo.d(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C14656E c14656e) {
                a(c14656e);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C14672p c14672p, C14667k c14667k) {
            super(1);
            this.f137311f = c14672p;
            this.f137312g = c14667k;
        }

        public final void a(C14680x navOptions) {
            Intrinsics.j(navOptions, "$this$navOptions");
            navOptions.a(a.f137313f);
            C14672p c14672p = this.f137311f;
            if (c14672p instanceof C14674r) {
                Sequence<C14672p> sequenceC = C14672p.INSTANCE.c(c14672p);
                C14667k c14667k = this.f137312g;
                for (C14672p c14672p2 : sequenceC) {
                    C14672p c14672pE = c14667k.E();
                    if (Intrinsics.e(c14672p2, c14672pE != null ? c14672pE.getParent() : null)) {
                        return;
                    }
                }
                if (C14667k.f137256I) {
                    navOptions.c(C14674r.INSTANCE.a(this.f137312g.G()).getId(), b.f137314f);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14680x c14680x) {
            a(c14680x);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li4/v;", "c", "()Li4/v;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$m */
    static final class m extends Lambda implements Function0<C14678v> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C14678v invoke() {
            C14678v c14678v = C14667k.this.inflater;
            return c14678v == null ? new C14678v(C14667k.this.getContext(), C14667k.this._navigatorProvider) : c14678v;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/h;", "it", "", "a", "(Li4/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$n */
    static final class n extends Lambda implements Function1<C14664h, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f137316f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C14667k f137317g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C14672p f137318h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Bundle f137319i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Ref.BooleanRef booleanRef, C14667k c14667k, C14672p c14672p, Bundle bundle) {
            super(1);
            this.f137316f = booleanRef;
            this.f137317g = c14667k;
            this.f137318h = c14672p;
            this.f137319i = bundle;
        }

        public final void a(C14664h it) {
            Intrinsics.j(it, "it");
            this.f137316f.f142828a = true;
            C14667k.q(this.f137317g, this.f137318h, this.f137319i, it, null, 8, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14664h c14664h) {
            a(c14664h);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"i4/k$o", "Landroidx/activity/F;", "", "handleOnBackPressed", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.k$o */
    public static final class o extends F {
        o() {
            super(false);
        }

        @Override // androidx.view.F
        public void handleOnBackPressed() {
            C14667k.this.X();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$p */
    static final class p extends Lambda implements Function1<String, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f137321f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.f137321f = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Intrinsics.e(str, this.f137321f));
        }
    }

    public boolean Y(int destinationId, boolean inclusive) {
        return Z(destinationId, inclusive, false);
    }

    public C14667k(Context context) {
        Object next;
        Intrinsics.j(context, "context");
        this.context = context;
        Iterator it = SequencesKt.q(context, d.f137295f).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.backQueue = new ArrayDeque<>();
        InterfaceC17140B<List<C14664h>> interfaceC17140BA = S.a(CollectionsKt.m());
        this._currentBackStack = interfaceC17140BA;
        this.currentBackStack = C17154h.c(interfaceC17140BA);
        InterfaceC17140B<List<C14664h>> interfaceC17140BA2 = S.a(CollectionsKt.m());
        this._visibleEntries = interfaceC17140BA2;
        this.visibleEntries = C17154h.c(interfaceC17140BA2);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = AbstractC6023l.b.f55276b;
        this.lifecycleObserver = new InterfaceC6027p() { // from class: i4.j
            @Override // androidx.view.InterfaceC6027p
            public final void onStateChanged(InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
                C14667k.N(this.f137254a, interfaceC6030s, aVar);
            }
        };
        this.onBackPressedCallback = new o();
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new C14654C();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        C14654C c14654c = this._navigatorProvider;
        c14654c.b(new C14676t(c14654c));
        this._navigatorProvider.b(new C14657a(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater = LazyKt.b(new m());
        InterfaceC17139A<C14664h> interfaceC17139AB = C17146H.b(1, 0, EnumC17050a.f161241b, 2, null);
        this._currentBackStackEntryFlow = interfaceC17139AB;
        this.currentBackStackEntryFlow = C17154h.b(interfaceC17139AB);
    }

    private final int F() {
        ArrayDeque<C14664h> arrayDeque = this.backQueue;
        int i10 = 0;
        if (arrayDeque != null && arrayDeque.isEmpty()) {
            return 0;
        }
        Iterator<C14664h> it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof C14674r) && (i10 = i10 + 1) < 0) {
                CollectionsKt.v();
            }
        }
        return i10;
    }

    private final List<C14664h> L(ArrayDeque<C14665i> backStackState) throws Resources.NotFoundException {
        C14672p c14672pG;
        ArrayList arrayList = new ArrayList();
        C14664h c14664hR = this.backQueue.r();
        if (c14664hR == null || (c14672pG = c14664hR.getDestination()) == null) {
            c14672pG = G();
        }
        if (backStackState != null) {
            for (C14665i c14665i : backStackState) {
                C14672p c14672pX = x(c14672pG, c14665i.getDestinationId());
                if (c14672pX == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + C14672p.INSTANCE.b(this.context, c14665i.getDestinationId()) + " cannot be found from the current destination " + c14672pG).toString());
                }
                arrayList.add(c14665i.c(this.context, c14672pX, H(), this.viewModel));
                c14672pG = c14672pX;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(C14667k this$0, InterfaceC6030s interfaceC6030s, AbstractC6023l.a event) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(interfaceC6030s, "<anonymous parameter 0>");
        Intrinsics.j(event, "event");
        this$0.hostLifecycleState = event.e();
        if (this$0._graph != null) {
            Iterator<C14664h> it = this$0.backQueue.iterator();
            while (it.hasNext()) {
                it.next().h(event);
            }
        }
    }

    private final void O(C14664h child, C14664h parent) {
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(parent);
        Intrinsics.g(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    private final void Q(C14672p node, Bundle args, C14679w navOptions, AbstractC14653B.a navigatorExtras) throws Resources.NotFoundException {
        boolean z10;
        boolean z11;
        boolean zC0;
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).k(true);
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (navOptions == null) {
            z10 = false;
        } else {
            if (navOptions.getPopUpToRoute() != null) {
                String popUpToRoute = navOptions.getPopUpToRoute();
                Intrinsics.g(popUpToRoute);
                zC0 = d0(popUpToRoute, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else {
                if (navOptions.getPopUpToId() != -1) {
                    zC0 = c0(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
                }
                z10 = false;
            }
            z10 = zC0;
        }
        Bundle bundleN = node.n(args);
        if (navOptions != null && navOptions.getRestoreState() && this.backStackMap.containsKey(Integer.valueOf(node.getId()))) {
            booleanRef.f142828a = j0(node.getId(), bundleN, navOptions, navigatorExtras);
            z11 = false;
        } else {
            z11 = navOptions != null && navOptions.getSingleTop() && M(node, args);
            if (!z11) {
                U(this._navigatorProvider.e(node.getNavigatorName()), CollectionsKt.e(C14664h.Companion.b(C14664h.INSTANCE, this.context, node, bundleN, H(), this.viewModel, null, null, 96, null)), navOptions, navigatorExtras, new n(booleanRef, this, node, bundleN));
            }
        }
        t0();
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).k(false);
        }
        if (z10 || booleanRef.f142828a || z11) {
            t();
        } else {
            s0();
        }
    }

    public static /* synthetic */ void T(C14667k c14667k, String str, C14679w c14679w, AbstractC14653B.a aVar, int i10, Object obj) throws Resources.NotFoundException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            c14679w = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        c14667k.R(str, c14679w, aVar);
    }

    private final void U(AbstractC14653B<? extends C14672p> abstractC14653B, List<C14664h> list, C14679w c14679w, AbstractC14653B.a aVar, Function1<? super C14664h, Unit> function1) {
        this.addToBackStackHandler = function1;
        abstractC14653B.e(list, c14679w, aVar);
        this.addToBackStackHandler = null;
    }

    private final void W(Bundle startDestinationArgs) throws Resources.NotFoundException {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle = this.navigatorStateToRestore;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                C14654C c14654c = this._navigatorProvider;
                Intrinsics.i(name, "name");
                AbstractC14653B abstractC14653BE = c14654c.e(name);
                Bundle bundle2 = bundle.getBundle(name);
                if (bundle2 != null) {
                    abstractC14653BE.h(bundle2);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                Intrinsics.h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                C14665i c14665i = (C14665i) parcelable;
                C14672p c14672pW = w(c14665i.getDestinationId());
                if (c14672pW == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + C14672p.INSTANCE.b(this.context, c14665i.getDestinationId()) + " cannot be found from the current destination " + E());
                }
                C14664h c14664hC = c14665i.c(this.context, c14672pW, H(), this.viewModel);
                AbstractC14653B<? extends C14672p> abstractC14653BE2 = this._navigatorProvider.e(c14672pW.getNavigatorName());
                Map<AbstractC14653B<? extends C14672p>, b> map = this.navigatorState;
                b bVar = map.get(abstractC14653BE2);
                if (bVar == null) {
                    bVar = new b(this, abstractC14653BE2);
                    map.put(abstractC14653BE2, bVar);
                }
                this.backQueue.add(c14664hC);
                bVar.m(c14664hC);
                C14674r parent = c14664hC.getDestination().getParent();
                if (parent != null) {
                    O(c14664hC, z(parent.getId()));
                }
            }
            t0();
            this.backStackToRestore = null;
        }
        Collection<AbstractC14653B<? extends C14672p>> collectionValues = this._navigatorProvider.f().values();
        ArrayList<AbstractC14653B<? extends C14672p>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((AbstractC14653B) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (AbstractC14653B<? extends C14672p> abstractC14653B : arrayList) {
            Map<AbstractC14653B<? extends C14672p>, b> map2 = this.navigatorState;
            b bVar2 = map2.get(abstractC14653B);
            if (bVar2 == null) {
                bVar2 = new b(this, abstractC14653B);
                map2.put(abstractC14653B, bVar2);
            }
            abstractC14653B.f(bVar2);
        }
        if (this._graph == null || !this.backQueue.isEmpty()) {
            t();
            return;
        }
        if (!this.deepLinkHandled && (activity = this.activity) != null) {
            Intrinsics.g(activity);
            if (K(activity.getIntent())) {
                return;
            }
        }
        C14674r c14674r = this._graph;
        Intrinsics.g(c14674r);
        Q(c14674r, startDestinationArgs, null, null);
    }

    private final void b0(AbstractC14653B<? extends C14672p> abstractC14653B, C14664h c14664h, boolean z10, Function1<? super C14664h, Unit> function1) {
        this.popFromBackStackHandler = function1;
        abstractC14653B.j(c14664h, z10);
        this.popFromBackStackHandler = null;
    }

    private final boolean c0(int destinationId, boolean inclusive, boolean saveState) throws Resources.NotFoundException {
        C14672p destination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.S0(this.backQueue).iterator();
        while (true) {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((C14664h) it.next()).getDestination();
            AbstractC14653B abstractC14653BE = this._navigatorProvider.e(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(abstractC14653BE);
            }
            if (destination.getId() == destinationId) {
                break;
            }
        }
        if (destination != null) {
            return u(arrayList, destination, inclusive, saveState);
        }
        FS.log_i("NavController", "Ignoring popBackStack to destination " + C14672p.INSTANCE.b(this.context, destinationId) + " as it was not found on the current back stack");
        return false;
    }

    private final boolean d0(String route, boolean inclusive, boolean saveState) {
        C14664h c14664hPrevious;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque<C14664h> arrayDeque = this.backQueue;
        ListIterator<C14664h> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c14664hPrevious = null;
                break;
            }
            c14664hPrevious = listIterator.previous();
            C14664h c14664h = c14664hPrevious;
            boolean zX = c14664h.getDestination().x(route, c14664h.c());
            if (inclusive || !zX) {
                arrayList.add(this._navigatorProvider.e(c14664h.getDestination().getNavigatorName()));
            }
            if (zX) {
                break;
            }
        }
        C14664h c14664h2 = c14664hPrevious;
        C14672p destination = c14664h2 != null ? c14664h2.getDestination() : null;
        if (destination != null) {
            return u(arrayList, destination, inclusive, saveState);
        }
        FS.log_i("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return false;
    }

    static /* synthetic */ boolean e0(C14667k c14667k, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return c14667k.c0(i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(C14664h popUpTo, boolean saveState, ArrayDeque<C14665i> savedState) {
        C14668l c14668l;
        P<Set<C14664h>> pC;
        Set<C14664h> value;
        C14664h c14664hLast = this.backQueue.last();
        if (!Intrinsics.e(c14664hLast, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + c14664hLast.getDestination() + ')').toString());
        }
        this.backQueue.removeLast();
        b bVar = this.navigatorState.get(get_navigatorProvider().e(c14664hLast.getDestination().getNavigatorName()));
        boolean z10 = true;
        if ((bVar == null || (pC = bVar.c()) == null || (value = pC.getValue()) == null || !value.contains(c14664hLast)) && !this.parentToChildCount.containsKey(c14664hLast)) {
            z10 = false;
        }
        AbstractC6023l.b state = c14664hLast.getLifecycle().getState();
        AbstractC6023l.b bVar2 = AbstractC6023l.b.f55277c;
        if (state.b(bVar2)) {
            if (saveState) {
                c14664hLast.k(bVar2);
                savedState.addFirst(new C14665i(c14664hLast));
            }
            if (z10) {
                c14664hLast.k(bVar2);
            } else {
                c14664hLast.k(AbstractC6023l.b.f55275a);
                r0(c14664hLast);
            }
        }
        if (saveState || z10 || (c14668l = this.viewModel) == null) {
            return;
        }
        c14668l.n(c14664hLast.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void g0(C14667k c14667k, C14664h c14664h, boolean z10, ArrayDeque arrayDeque, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            arrayDeque = new ArrayDeque();
        }
        c14667k.f0(c14664h, z10, arrayDeque);
    }

    private final boolean j0(int id2, Bundle args, C14679w navOptions, AbstractC14653B.a navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id2))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(id2));
        CollectionsKt.H(this.backStackMap.values(), new p(str));
        return v(L((ArrayDeque) TypeIntrinsics.d(this.backStackStates).remove(str)), args, navOptions, navigatorExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(C14672p node, Bundle finalArgs, C14664h backStackEntry, List<C14664h> restoredEntries) {
        Bundle bundle;
        ArrayDeque<C14664h> arrayDeque;
        C14672p destination;
        List<C14664h> list;
        C14664h c14664h;
        C14674r c14674r;
        C14664h c14664hPrevious;
        C14664h c14664hPrevious2;
        List<C14664h> list2 = restoredEntries;
        C14672p destination2 = backStackEntry.getDestination();
        if (!(destination2 instanceof InterfaceC14659c)) {
            while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof InterfaceC14659c) && e0(this, this.backQueue.last().getDestination().getId(), true, false, 4, null)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        C14664h c14664h2 = null;
        if (node instanceof C14674r) {
            C14672p c14672p = destination2;
            while (true) {
                Intrinsics.g(c14672p);
                C14674r parent = c14672p.getParent();
                if (parent != null) {
                    ListIterator<C14664h> listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c14664hPrevious2 = listIterator.previous();
                            if (Intrinsics.e(c14664hPrevious2.getDestination(), parent)) {
                                break;
                            }
                        } else {
                            c14664hPrevious2 = null;
                            break;
                        }
                    }
                    C14664h c14664hB = c14664hPrevious2;
                    if (c14664hB == null) {
                        bundle = finalArgs;
                        destination = destination2;
                        c14664hB = C14664h.Companion.b(C14664h.INSTANCE, this.context, parent, bundle, H(), this.viewModel, null, null, 96, null);
                    } else {
                        bundle = finalArgs;
                        destination = destination2;
                    }
                    arrayDeque2.addFirst(c14664hB);
                    if (this.backQueue.isEmpty() || this.backQueue.last().getDestination() != parent) {
                        c14664h = backStackEntry;
                        list = restoredEntries;
                        arrayDeque = arrayDeque2;
                    } else {
                        list = restoredEntries;
                        arrayDeque = arrayDeque2;
                        c14664h = backStackEntry;
                        g0(this, this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    bundle = finalArgs;
                    arrayDeque = arrayDeque2;
                    destination = destination2;
                    list = list2;
                    c14664h = backStackEntry;
                }
                if (parent == null || parent == node) {
                    break;
                }
                list2 = list;
                c14672p = parent;
                arrayDeque2 = arrayDeque;
                destination2 = destination;
            }
        } else {
            bundle = finalArgs;
            arrayDeque = arrayDeque2;
            destination = destination2;
            list = list2;
            c14664h = backStackEntry;
        }
        C14672p destination3 = arrayDeque.isEmpty() ? destination : ((C14664h) arrayDeque.first()).getDestination();
        while (destination3 != null && w(destination3.getId()) != destination3) {
            C14674r parent2 = destination3.getParent();
            if (parent2 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<C14664h> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        c14664hPrevious = listIterator2.previous();
                        if (Intrinsics.e(c14664hPrevious.getDestination(), parent2)) {
                            break;
                        }
                    } else {
                        c14664hPrevious = null;
                        break;
                    }
                }
                C14664h c14664hB2 = c14664hPrevious;
                if (c14664hB2 == null) {
                    c14674r = parent2;
                    c14664hB2 = C14664h.Companion.b(C14664h.INSTANCE, this.context, c14674r, parent2.n(bundle2), H(), this.viewModel, null, null, 96, null);
                } else {
                    c14674r = parent2;
                }
                arrayDeque.addFirst(c14664hB2);
            } else {
                c14674r = parent2;
            }
            destination3 = c14674r;
        }
        if (!arrayDeque.isEmpty()) {
            destination = ((C14664h) arrayDeque.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof C14674r)) {
            C14672p destination4 = this.backQueue.last().getDestination();
            Intrinsics.h(destination4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((C14674r) destination4).L(destination.getId(), false) != null) {
                break;
            } else {
                g0(this, this.backQueue.last(), false, null, 6, null);
            }
        }
        C14664h c14664hP = this.backQueue.p();
        if (c14664hP == null) {
            c14664hP = (C14664h) arrayDeque.p();
        }
        if (!Intrinsics.e(c14664hP != null ? c14664hP.getDestination() : null, this._graph)) {
            ListIterator<C14664h> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                C14664h c14664hPrevious3 = listIterator3.previous();
                C14672p destination5 = c14664hPrevious3.getDestination();
                C14674r c14674r2 = this._graph;
                Intrinsics.g(c14674r2);
                if (Intrinsics.e(destination5, c14674r2)) {
                    c14664h2 = c14664hPrevious3;
                    break;
                }
            }
            C14664h c14664hB3 = c14664h2;
            if (c14664hB3 == null) {
                C14664h.Companion companion = C14664h.INSTANCE;
                Context context = this.context;
                C14674r c14674r3 = this._graph;
                Intrinsics.g(c14674r3);
                C14674r c14674r4 = this._graph;
                Intrinsics.g(c14674r4);
                c14664hB3 = C14664h.Companion.b(companion, context, c14674r3, c14674r4.n(bundle), H(), this.viewModel, null, null, 96, null);
            }
            arrayDeque.addFirst(c14664hB3);
        }
        for (C14664h c14664h3 : arrayDeque) {
            b bVar = this.navigatorState.get(this._navigatorProvider.e(c14664h3.getDestination().getNavigatorName()));
            if (bVar == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
            bVar.m(c14664h3);
        }
        this.backQueue.addAll(arrayDeque);
        this.backQueue.add(c14664h);
        for (C14664h c14664h4 : CollectionsKt.Q0(arrayDeque, c14664h)) {
            C14674r parent3 = c14664h4.getDestination().getParent();
            if (parent3 != null) {
                O(c14664h4, z(parent3.getId()));
            }
        }
    }

    private final boolean p0() throws Resources.NotFoundException {
        int i10 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        Intrinsics.g(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        Intrinsics.g(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        Intrinsics.g(intArray);
        List<Integer> listP1 = ArraysKt.p1(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int iIntValue = ((Number) CollectionsKt.M(listP1)).intValue();
        if (parcelableArrayList != null) {
        }
        if (listP1.isEmpty()) {
            return false;
        }
        C14672p c14672pX = x(G(), iIntValue);
        if (c14672pX instanceof C14674r) {
            iIntValue = C14674r.INSTANCE.a((C14674r) c14672pX).getId();
        }
        C14672p c14672pE = E();
        if (c14672pE == null || iIntValue != c14672pE.getId()) {
            return false;
        }
        C14670n c14670nS = s();
        Bundle bundleB = C14835c.b(TuplesKt.a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        c14670nS.e(bundleB);
        for (Object obj : listP1) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            c14670nS.a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        c14670nS.b().n();
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q(C14667k c14667k, C14672p c14672p, Bundle bundle, C14664h c14664h, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i10 & 8) != 0) {
            list = CollectionsKt.m();
        }
        c14667k.p(c14672p, bundle, c14664h, list);
    }

    private final boolean r(int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).k(true);
        }
        boolean zJ0 = j0(destinationId, null, C14681y.a(e.f137296f), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).k(false);
        }
        return zJ0 && c0(destinationId, true, false);
    }

    private final boolean t() {
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof C14674r)) {
            g0(this, this.backQueue.last(), false, null, 6, null);
        }
        C14664h c14664hR = this.backQueue.r();
        if (c14664hR != null) {
            this.backStackEntriesToDispatch.add(c14664hR);
        }
        this.dispatchReentrantCount++;
        s0();
        int i10 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i10;
        if (i10 == 0) {
            List<C14664h> listM1 = CollectionsKt.m1(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (C14664h c14664h : listM1) {
                Iterator<c> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().a(this, c14664h.getDestination(), c14664h.c());
                }
                this._currentBackStackEntryFlow.b(c14664h);
            }
            this._currentBackStack.b(CollectionsKt.m1(this.backQueue));
            this._visibleEntries.b(h0());
        }
        return c14664hR != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t0() {
        /*
            r3 = this;
            androidx.activity.F r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.F()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C14667k.t0():void");
    }

    private final boolean u(List<? extends AbstractC14653B<?>> popOperations, C14672p foundDestination, boolean inclusive, boolean saveState) {
        C14667k c14667k;
        boolean z10;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayDeque<C14665i> arrayDeque = new ArrayDeque<>();
        Iterator<? extends AbstractC14653B<?>> it = popOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                c14667k = this;
                z10 = saveState;
                break;
            }
            AbstractC14653B<? extends C14672p> abstractC14653B = (AbstractC14653B) it.next();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            c14667k = this;
            z10 = saveState;
            b0(abstractC14653B, this.backQueue.last(), z10, new f(booleanRef2, booleanRef, c14667k, z10, arrayDeque));
            if (!booleanRef2.f142828a) {
                break;
            }
            saveState = z10;
        }
        if (z10) {
            if (!inclusive) {
                for (C14672p c14672p : SequencesKt.U(SequencesKt.q(foundDestination, g.f137302f), new h())) {
                    Map<Integer, String> map = c14667k.backStackMap;
                    Integer numValueOf = Integer.valueOf(c14672p.getId());
                    C14665i c14665iP = arrayDeque.p();
                    map.put(numValueOf, c14665iP != null ? c14665iP.getId() : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                C14665i c14665iFirst = arrayDeque.first();
                Iterator it2 = SequencesKt.U(SequencesKt.q(w(c14665iFirst.getDestinationId()), i.f137304f), new j()).iterator();
                while (it2.hasNext()) {
                    c14667k.backStackMap.put(Integer.valueOf(((C14672p) it2.next()).getId()), c14665iFirst.getId());
                }
                if (c14667k.backStackMap.values().contains(c14665iFirst.getId())) {
                    c14667k.backStackStates.put(c14665iFirst.getId(), arrayDeque);
                }
            }
        }
        t0();
        return booleanRef.f142828a;
    }

    private final boolean v(List<C14664h> entries, Bundle args, C14679w navOptions, AbstractC14653B.a navigatorExtras) {
        C14664h c14664h;
        C14672p destination;
        ArrayList<List<C14664h>> arrayList = new ArrayList();
        ArrayList<C14664h> arrayList2 = new ArrayList();
        for (Object obj : entries) {
            if (!(((C14664h) obj).getDestination() instanceof C14674r)) {
                arrayList2.add(obj);
            }
        }
        for (C14664h c14664h2 : arrayList2) {
            List list = (List) CollectionsKt.F0(arrayList);
            if (Intrinsics.e((list == null || (c14664h = (C14664h) CollectionsKt.D0(list)) == null || (destination = c14664h.getDestination()) == null) ? null : destination.getNavigatorName(), c14664h2.getDestination().getNavigatorName())) {
                list.add(c14664h2);
            } else {
                arrayList.add(CollectionsKt.s(c14664h2));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List<C14664h> list2 : arrayList) {
            U(this._navigatorProvider.e(((C14664h) CollectionsKt.s0(list2)).getDestination().getNavigatorName()), list2, navOptions, navigatorExtras, new C2165k(booleanRef, entries, new Ref.IntRef(), this, args));
        }
        return booleanRef.f142828a;
    }

    private final String y(int[] deepLink) {
        C14674r c14674r;
        C14674r c14674r2 = this._graph;
        int length = deepLink.length;
        int i10 = 0;
        while (true) {
            C14672p c14672pK = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = deepLink[i10];
            if (i10 == 0) {
                C14674r c14674r3 = this._graph;
                Intrinsics.g(c14674r3);
                if (c14674r3.getId() == i11) {
                    c14672pK = this._graph;
                }
            } else {
                Intrinsics.g(c14674r2);
                c14672pK = c14674r2.K(i11);
            }
            if (c14672pK == null) {
                return C14672p.INSTANCE.b(this.context, i11);
            }
            if (i10 != deepLink.length - 1 && (c14672pK instanceof C14674r)) {
                while (true) {
                    c14674r = (C14674r) c14672pK;
                    Intrinsics.g(c14674r);
                    if (!(c14674r.K(c14674r.getStartDestId()) instanceof C14674r)) {
                        break;
                    }
                    c14672pK = c14674r.K(c14674r.getStartDestId());
                }
                c14674r2 = c14674r;
            }
            i10++;
        }
    }

    public final C14664h A(String route) {
        C14664h c14664hPrevious;
        Intrinsics.j(route, "route");
        ArrayDeque<C14664h> arrayDeque = this.backQueue;
        ListIterator<C14664h> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c14664hPrevious = null;
                break;
            }
            c14664hPrevious = listIterator.previous();
            C14664h c14664h = c14664hPrevious;
            if (c14664h.getDestination().x(route, c14664h.c())) {
                break;
            }
        }
        C14664h c14664h2 = c14664hPrevious;
        if (c14664h2 != null) {
            return c14664h2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + E()).toString());
    }

    /* renamed from: B, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public C14664h C() {
        return this.backQueue.r();
    }

    public final InterfaceC17152f<C14664h> D() {
        return this.currentBackStackEntryFlow;
    }

    public C14674r G() {
        C14674r c14674r = this._graph;
        if (c14674r == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.h(c14674r, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return c14674r;
    }

    public final AbstractC6023l.b H() {
        return this.lifecycleOwner == null ? AbstractC6023l.b.f55277c : this.hostLifecycleState;
    }

    /* renamed from: I, reason: from getter */
    public C14654C get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public final P<List<C14664h>> J() {
        return this.visibleEntries;
    }

    public boolean K(Intent intent) throws Resources.NotFoundException {
        int[] intArray;
        C14672p c14672pK;
        C14674r c14674r;
        Bundle bundle;
        int i10 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e10) {
                FS.log_e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e10);
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null || intArray.length == 0) {
            C14674r c14674r2 = this._graph;
            Intrinsics.g(c14674r2);
            C14672p.b bVarY = c14674r2.y(new C14671o(intent));
            if (bVarY != null) {
                C14672p destination = bVarY.getDestination();
                int[] iArrP = C14672p.p(destination, null, 1, null);
                Bundle bundleN = destination.n(bVarY.getMatchingArgs());
                if (bundleN != null) {
                    bundle2.putAll(bundleN);
                }
                intArray = iArrP;
                parcelableArrayList = null;
            }
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strY = y(intArray);
        if (strY != null) {
            FS.log_i("NavController", "Could not find destination " + strY + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i11 = 0; i11 < length; i11++) {
            Bundle bundle4 = new Bundle();
            bundle4.putAll(bundle2);
            if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i11)) != null) {
                bundle4.putAll(bundle);
            }
            bundleArr[i11] = bundle4;
        }
        int flags = intent.getFlags();
        int i12 = 268435456 & flags;
        if (i12 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            y yVarE = y.k(this.context).e(intent);
            Intrinsics.i(yVarE, "create(context)\n        …ntWithParentStack(intent)");
            yVarE.n();
            Activity activity = this.activity;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i12 != 0) {
            if (!this.backQueue.isEmpty()) {
                C14674r c14674r3 = this._graph;
                Intrinsics.g(c14674r3);
                e0(this, c14674r3.getId(), true, false, 4, null);
            }
            while (i10 < intArray.length) {
                int i13 = intArray[i10];
                int i14 = i10 + 1;
                Bundle bundle5 = bundleArr[i10];
                C14672p c14672pW = w(i13);
                if (c14672pW == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + C14672p.INSTANCE.b(this.context, i13) + " cannot be found from the current destination " + E());
                }
                Q(c14672pW, bundle5, C14681y.a(new l(c14672pW, this)), null);
                i10 = i14;
            }
            this.deepLinkHandled = true;
            return true;
        }
        C14674r c14674r4 = this._graph;
        int length2 = intArray.length;
        for (int i15 = 0; i15 < length2; i15++) {
            int i16 = intArray[i15];
            Bundle bundle6 = bundleArr[i15];
            if (i15 == 0) {
                c14672pK = this._graph;
            } else {
                Intrinsics.g(c14674r4);
                c14672pK = c14674r4.K(i16);
            }
            if (c14672pK == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + C14672p.INSTANCE.b(this.context, i16) + " cannot be found in graph " + c14674r4);
            }
            if (i15 == intArray.length - 1) {
                C14679w.a aVar = new C14679w.a();
                C14674r c14674r5 = this._graph;
                Intrinsics.g(c14674r5);
                Q(c14672pK, bundle6, C14679w.a.i(aVar, c14674r5.getId(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (c14672pK instanceof C14674r) {
                while (true) {
                    c14674r = (C14674r) c14672pK;
                    Intrinsics.g(c14674r);
                    if (!(c14674r.K(c14674r.getStartDestId()) instanceof C14674r)) {
                        break;
                    }
                    c14672pK = c14674r.K(c14674r.getStartDestId());
                }
                c14674r4 = c14674r;
            }
        }
        this.deepLinkHandled = true;
        return true;
    }

    public void P(C14671o request, C14679w navOptions, AbstractC14653B.a navigatorExtras) throws Resources.NotFoundException {
        Intrinsics.j(request, "request");
        C14674r c14674r = this._graph;
        if (c14674r == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        Intrinsics.g(c14674r);
        C14672p.b bVarY = c14674r.y(request);
        if (bVarY == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        Bundle bundleN = bVarY.getDestination().n(bVarY.getMatchingArgs());
        if (bundleN == null) {
            bundleN = new Bundle();
        }
        C14672p destination = bVarY.getDestination();
        Intent intent = new Intent();
        intent.setDataAndType(request.getUri(), request.getMimeType());
        intent.setAction(request.getAction());
        bundleN.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        Q(destination, bundleN, navOptions, navigatorExtras);
    }

    @JvmOverloads
    public final void R(String route, C14679w navOptions, AbstractC14653B.a navigatorExtras) throws Resources.NotFoundException {
        Intrinsics.j(route, "route");
        C14671o.a.Companion companion = C14671o.a.INSTANCE;
        Uri uri = Uri.parse(C14672p.INSTANCE.a(route));
        Intrinsics.f(uri, "Uri.parse(this)");
        P(companion.a(uri).a(), navOptions, navigatorExtras);
    }

    public final void S(String route, Function1<? super C14680x, Unit> builder) throws Resources.NotFoundException {
        Intrinsics.j(route, "route");
        Intrinsics.j(builder, "builder");
        T(this, route, C14681y.a(builder), null, 4, null);
    }

    public boolean X() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        C14672p c14672pE = E();
        Intrinsics.g(c14672pE);
        return Y(c14672pE.getId(), true);
    }

    public final void a0(C14664h popUpTo, Function0<Unit> onComplete) throws Resources.NotFoundException {
        Intrinsics.j(popUpTo, "popUpTo");
        Intrinsics.j(onComplete, "onComplete");
        int iIndexOf = this.backQueue.indexOf(popUpTo);
        if (iIndexOf < 0) {
            FS.log_i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != this.backQueue.size()) {
            c0(this.backQueue.get(i10).getDestination().getId(), true, false);
        }
        g0(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        t0();
        t();
    }

    public final List<C14664h> h0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<C14664h> value = ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                C14664h c14664h = (C14664h) obj;
                if (!arrayList.contains(c14664h) && !c14664h.getMaxLifecycle().b(AbstractC6023l.b.f55278d)) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt.C(arrayList, arrayList2);
        }
        ArrayDeque<C14664h> arrayDeque = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (C14664h c14664h2 : arrayDeque) {
            C14664h c14664h3 = c14664h2;
            if (!arrayList.contains(c14664h3) && c14664h3.getMaxLifecycle().b(AbstractC6023l.b.f55278d)) {
                arrayList3.add(c14664h2);
            }
        }
        CollectionsKt.C(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((C14664h) obj2).getDestination() instanceof C14674r)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void i0(Bundle navState) {
        if (navState == null) {
            return;
        }
        navState.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = navState.getBundle("android-support-nav:controller:navigatorState");
        this.backStackToRestore = navState.getParcelableArray("android-support-nav:controller:backStack");
        this.backStackStates.clear();
        int[] intArray = navState.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = navState.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                i10++;
                i11++;
            }
        }
        ArrayList<String> stringArrayList2 = navState.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = navState.getParcelableArray("android-support-nav:controller:backStackStates:" + id2);
                if (parcelableArray != null) {
                    Map<String, ArrayDeque<C14665i>> map = this.backStackStates;
                    Intrinsics.i(id2, "id");
                    ArrayDeque<C14665i> arrayDeque = new ArrayDeque<>(parcelableArray.length);
                    Iterator itA = ArrayIteratorKt.a(parcelableArray);
                    while (itA.hasNext()) {
                        Parcelable parcelable = (Parcelable) itA.next();
                        Intrinsics.h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        arrayDeque.add((C14665i) parcelable);
                    }
                    map.put(id2, arrayDeque);
                }
            }
        }
        this.deepLinkHandled = navState.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle k0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, AbstractC14653B<? extends C14672p>> entry : this._navigatorProvider.f().entrySet()) {
            String key = entry.getKey();
            Bundle bundleI = entry.getValue().i();
            if (bundleI != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleI);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.backQueue.size()];
            Iterator<C14664h> it = this.backQueue.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new C14665i(it.next());
                i10++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i11] = iIntValue;
                arrayList2.add(value);
                i11++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, ArrayDeque<C14665i>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                ArrayDeque<C14665i> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i12 = 0;
                for (C14665i c14665i : value2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.w();
                    }
                    parcelableArr2[i12] = c14665i;
                    i12 = i13;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + key2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundle;
    }

    public void l0(C14674r graph) throws Resources.NotFoundException {
        Intrinsics.j(graph, "graph");
        m0(graph, null);
    }

    public void m0(C14674r graph, Bundle startDestinationArgs) throws Resources.NotFoundException {
        C14667k c14667k;
        Intrinsics.j(graph, "graph");
        if (!Intrinsics.e(this._graph, graph)) {
            C14674r c14674r = this._graph;
            if (c14674r != null) {
                for (Integer id2 : new ArrayList(this.backStackMap.keySet())) {
                    Intrinsics.i(id2, "id");
                    r(id2.intValue());
                }
                c14667k = this;
                e0(c14667k, c14674r.getId(), true, false, 4, null);
            } else {
                c14667k = this;
            }
            c14667k._graph = graph;
            W(startDestinationArgs);
            return;
        }
        int iM = graph.P().m();
        for (int i10 = 0; i10 < iM; i10++) {
            C14672p c14672pN = graph.P().n(i10);
            C14674r c14674r2 = this._graph;
            Intrinsics.g(c14674r2);
            int i11 = c14674r2.P().i(i10);
            C14674r c14674r3 = this._graph;
            Intrinsics.g(c14674r3);
            c14674r3.P().l(i11, c14672pN);
        }
        for (C14664h c14664h : this.backQueue) {
            List<C14672p> listT = CollectionsKt.T(SequencesKt.W(C14672p.INSTANCE.c(c14664h.getDestination())));
            C14672p c14672pK = this._graph;
            Intrinsics.g(c14672pK);
            for (C14672p c14672p : listT) {
                if (!Intrinsics.e(c14672p, this._graph) || !Intrinsics.e(c14672pK, graph)) {
                    if (c14672pK instanceof C14674r) {
                        c14672pK = ((C14674r) c14672pK).K(c14672p.getId());
                        Intrinsics.g(c14672pK);
                    }
                }
            }
            c14664h.j(c14672pK);
        }
    }

    public void n0(InterfaceC6030s owner) {
        AbstractC6023l lifecycle;
        Intrinsics.j(owner, "owner");
        if (Intrinsics.e(owner, this.lifecycleOwner)) {
            return;
        }
        InterfaceC6030s interfaceC6030s = this.lifecycleOwner;
        if (interfaceC6030s != null && (lifecycle = interfaceC6030s.getLifecycle()) != null) {
            lifecycle.d(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().a(this.lifecycleObserver);
    }

    public void o0(g0 viewModelStore) {
        Intrinsics.j(viewModelStore, "viewModelStore");
        C14668l c14668l = this.viewModel;
        C14668l.Companion bVar = C14668l.INSTANCE;
        if (Intrinsics.e(c14668l, bVar.a(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = bVar.a(viewModelStore);
    }

    public final C14664h r0(C14664h child) {
        Intrinsics.j(child, "child");
        C14664h c14664hRemove = this.childToParentEntries.remove(child);
        if (c14664hRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(c14664hRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            b bVar = this.navigatorState.get(this._navigatorProvider.e(c14664hRemove.getDestination().getNavigatorName()));
            if (bVar != null) {
                bVar.e(c14664hRemove);
            }
            this.parentToChildCount.remove(c14664hRemove);
        }
        return c14664hRemove;
    }

    public C14670n s() {
        return new C14670n(this);
    }

    public final void s0() {
        AtomicInteger atomicInteger;
        P<Set<C14664h>> pC;
        Set<C14664h> value;
        List<C14664h> listM1 = CollectionsKt.m1(this.backQueue);
        if (listM1.isEmpty()) {
            return;
        }
        C14672p destination = ((C14664h) CollectionsKt.D0(listM1)).getDestination();
        ArrayList arrayList = new ArrayList();
        if (destination instanceof InterfaceC14659c) {
            Iterator it = CollectionsKt.S0(listM1).iterator();
            while (it.hasNext()) {
                C14672p destination2 = ((C14664h) it.next()).getDestination();
                arrayList.add(destination2);
                if (!(destination2 instanceof InterfaceC14659c) && !(destination2 instanceof C14674r)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C14664h c14664h : CollectionsKt.S0(listM1)) {
            AbstractC6023l.b maxLifecycle = c14664h.getMaxLifecycle();
            C14672p destination3 = c14664h.getDestination();
            if (destination != null && destination3.getId() == destination.getId()) {
                AbstractC6023l.b bVar = AbstractC6023l.b.f55279e;
                if (maxLifecycle != bVar) {
                    b bVar2 = this.navigatorState.get(get_navigatorProvider().e(c14664h.getDestination().getNavigatorName()));
                    if (Intrinsics.e((bVar2 == null || (pC = bVar2.c()) == null || (value = pC.getValue()) == null) ? null : Boolean.valueOf(value.contains(c14664h)), Boolean.TRUE) || ((atomicInteger = this.parentToChildCount.get(c14664h)) != null && atomicInteger.get() == 0)) {
                        map.put(c14664h, AbstractC6023l.b.f55278d);
                    } else {
                        map.put(c14664h, bVar);
                    }
                }
                C14672p c14672p = (C14672p) CollectionsKt.u0(arrayList);
                if (c14672p != null && c14672p.getId() == destination3.getId()) {
                    CollectionsKt.K(arrayList);
                }
                destination = destination.getParent();
            } else if (arrayList.isEmpty() || destination3.getId() != ((C14672p) CollectionsKt.s0(arrayList)).getId()) {
                c14664h.k(AbstractC6023l.b.f55277c);
            } else {
                C14672p c14672p2 = (C14672p) CollectionsKt.K(arrayList);
                if (maxLifecycle == AbstractC6023l.b.f55279e) {
                    c14664h.k(AbstractC6023l.b.f55278d);
                } else {
                    AbstractC6023l.b bVar3 = AbstractC6023l.b.f55278d;
                    if (maxLifecycle != bVar3) {
                        map.put(c14664h, bVar3);
                    }
                }
                C14674r parent = c14672p2.getParent();
                if (parent != null && !arrayList.contains(parent)) {
                    arrayList.add(parent);
                }
            }
        }
        for (C14664h c14664h2 : listM1) {
            AbstractC6023l.b bVar4 = (AbstractC6023l.b) map.get(c14664h2);
            if (bVar4 != null) {
                c14664h2.k(bVar4);
            } else {
                c14664h2.l();
            }
        }
    }

    public final C14672p w(int destinationId) {
        C14672p destination;
        C14674r c14674r = this._graph;
        if (c14674r == null) {
            return null;
        }
        Intrinsics.g(c14674r);
        if (c14674r.getId() == destinationId) {
            return this._graph;
        }
        C14664h c14664hR = this.backQueue.r();
        if (c14664hR == null || (destination = c14664hR.getDestination()) == null) {
            destination = this._graph;
            Intrinsics.g(destination);
        }
        return x(destination, destinationId);
    }

    public C14664h z(int destinationId) {
        C14664h c14664hPrevious;
        ArrayDeque<C14664h> arrayDeque = this.backQueue;
        ListIterator<C14664h> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c14664hPrevious = null;
                break;
            }
            c14664hPrevious = listIterator.previous();
            if (c14664hPrevious.getDestination().getId() == destinationId) {
                break;
            }
        }
        C14664h c14664h = c14664hPrevious;
        if (c14664h != null) {
            return c14664h;
        }
        throw new IllegalArgumentException(("No destination with ID " + destinationId + " is on the NavController's back stack. The current destination is " + E()).toString());
    }

    private final boolean M(C14672p node, Bundle args) {
        int id2;
        C14672p destination;
        int iNextIndex;
        C14664h c14664hC = C();
        if (node instanceof C14674r) {
            id2 = C14674r.INSTANCE.a((C14674r) node).getId();
        } else {
            id2 = node.getId();
        }
        if (c14664hC != null && (destination = c14664hC.getDestination()) != null && id2 == destination.getId()) {
            ArrayDeque<C14664h> arrayDeque = new ArrayDeque();
            ArrayDeque<C14664h> arrayDeque2 = this.backQueue;
            ListIterator<C14664h> listIterator = arrayDeque2.listIterator(arrayDeque2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (listIterator.previous().getDestination() == node) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            while (CollectionsKt.o(this.backQueue) >= iNextIndex) {
                C14664h c14664hRemoveLast = this.backQueue.removeLast();
                r0(c14664hRemoveLast);
                arrayDeque.addFirst(new C14664h(c14664hRemoveLast, c14664hRemoveLast.getDestination().n(args)));
            }
            for (C14664h c14664h : arrayDeque) {
                C14674r parent = c14664h.getDestination().getParent();
                if (parent != null) {
                    O(c14664h, z(parent.getId()));
                }
                this.backQueue.add(c14664h);
            }
            for (C14664h c14664h2 : arrayDeque) {
                this._navigatorProvider.e(c14664h2.getDestination().getNavigatorName()).g(c14664h2);
            }
            return true;
        }
        return false;
    }

    private final boolean q0() {
        Bundle matchingArgs;
        C14672p c14672pE = E();
        Intrinsics.g(c14672pE);
        int id2 = c14672pE.getId();
        for (C14674r parent = c14672pE.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestId() != id2) {
                Bundle bundle = new Bundle();
                Activity activity = this.activity;
                if (activity != null) {
                    Intrinsics.g(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        Intrinsics.g(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            Intrinsics.g(activity3);
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            C14674r c14674r = this._graph;
                            Intrinsics.g(c14674r);
                            Activity activity4 = this.activity;
                            Intrinsics.g(activity4);
                            Intent intent = activity4.getIntent();
                            Intrinsics.i(intent, "activity!!.intent");
                            C14672p.b bVarY = c14674r.y(new C14671o(intent));
                            if (bVarY != null) {
                                matchingArgs = bVarY.getMatchingArgs();
                            } else {
                                matchingArgs = null;
                            }
                            if (matchingArgs != null) {
                                bundle.putAll(bVarY.getDestination().n(bVarY.getMatchingArgs()));
                            }
                        }
                    }
                }
                C14670n.g(new C14670n(this), parent.getId(), null, 2, null).e(bundle).b().n();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                    return true;
                }
                return true;
            }
            id2 = parent.getId();
        }
        return false;
    }

    private final C14672p x(C14672p c14672p, int i10) {
        C14674r parent;
        if (c14672p.getId() == i10) {
            return c14672p;
        }
        if (c14672p instanceof C14674r) {
            parent = (C14674r) c14672p;
        } else {
            parent = c14672p.getParent();
            Intrinsics.g(parent);
        }
        return parent.K(i10);
    }

    public C14672p E() {
        C14664h c14664hC = C();
        if (c14664hC != null) {
            return c14664hC.getDestination();
        }
        return null;
    }

    public boolean V() {
        Bundle extras;
        Intent intent;
        if (F() == 1) {
            Activity activity = this.activity;
            int[] intArray = null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                extras = intent.getExtras();
            } else {
                extras = null;
            }
            if (extras != null) {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            }
            if (intArray != null) {
                return p0();
            }
            return q0();
        }
        return X();
    }

    public boolean Z(int destinationId, boolean inclusive, boolean saveState) {
        if (c0(destinationId, inclusive, saveState) && t()) {
            return true;
        }
        return false;
    }
}
