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
import androidx.view.AbstractC6165l;
import androidx.view.F;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6171r;
import androidx.view.InterfaceC6172s;
import androidx.view.g0;
import com.fullstory.FS;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import j2.C14923c;
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
import kotlin.AbstractC14656B;
import kotlin.C14667h;
import kotlin.C14671l;
import kotlin.C14674o;
import kotlin.C14675p;
import kotlin.C14682w;
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
import ov.EnumC16325a;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 Í\u00012\u00020\u0001:\u0006\u008c\u0001\u0091\u0001\u0095\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJb\u0010\u0019\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJP\u0010\u001e\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u001c2\u0010\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000e2\u0006\u0010*\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b+\u0010,J1\u00100\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001cH\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u001cH\u0002¢\u0006\u0004\b7\u00105J\u0019\u0010:\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u0004\u0018\u00010%2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u0004\u0018\u00010\r*\u00020\r2\b\b\u0001\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b@\u0010AJ5\u0010D\u001a\u00020\t2\u0006\u0010B\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\bF\u0010GJ5\u0010I\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bI\u0010JJ;\u0010K\u001a\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010C\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bK\u0010LJ%\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0002¢\u0006\u0004\bN\u0010OJ9\u0010R\u001a\u00020\t2\u0006\u0010B\u001a\u00020\r2\b\u0010P\u001a\u0004\u0018\u0001082\u0006\u0010\u0017\u001a\u00020\u00062\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010V\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u001cH\u0017¢\u0006\u0004\bX\u00105J!\u0010Y\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0017¢\u0006\u0004\bY\u0010ZJ)\u0010[\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b[\u0010$J%\u0010^\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\t0\\H\u0000¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u001cH\u0017¢\u0006\u0004\b`\u00105J\u000f\u0010a\u001a\u00020\tH\u0000¢\u0006\u0004\ba\u0010UJ\u0015\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\bb\u0010cJ!\u0010f\u001a\u00020\t2\u0006\u0010e\u001a\u00020d2\b\u00109\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0004\bf\u0010gJ\u0019\u0010j\u001a\u00020\u001c2\b\u0010i\u001a\u0004\u0018\u00010hH\u0017¢\u0006\u0004\bj\u0010kJ\u001b\u0010l\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\bl\u0010mJ+\u0010p\u001a\u00020\t2\u0006\u0010o\u001a\u00020n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\bp\u0010qJ0\u0010u\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0017\u0010t\u001a\u0013\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0002\bsH\u0007¢\u0006\u0004\bu\u0010vJ/\u0010w\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\bw\u0010xJ\u000f\u0010z\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u0011\u0010|\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0004\b|\u0010}J\u0019\u0010\u007f\u001a\u00020\t2\b\u0010~\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0004\b\u007f\u0010;J\u001c\u0010\u0082\u0001\u001a\u00020\t2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\t2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0017¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020 H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0018\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R#\u0010¢\u0001\u001a\f\u0012\u0005\u0012\u00030\u009f\u0001\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¤\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010[R\u001d\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R$\u0010«\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R,\u0010±\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¬\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R$\u0010³\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010ª\u0001R)\u0010¶\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¬\u00018\u0006¢\u0006\u0010\n\u0006\b´\u0001\u0010®\u0001\u001a\u0006\bµ\u0001\u0010°\u0001R$\u0010º\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R%\u0010½\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030»\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R&\u0010¿\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010%0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¹\u0001R)\u0010À\u0001\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0·\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bR\u0010¹\u0001R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001b\u0010Æ\u0001\u001a\u0005\u0018\u00010Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010Å\u0001R\u001e\u0010Ê\u0001\u001a\n\u0012\u0005\u0012\u00030È\u00010Ç\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bz\u0010É\u0001R)\u0010Ñ\u0001\u001a\u00030Ë\u00018@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b7\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R\u0017\u0010Ô\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010Ó\u0001R\u0017\u0010×\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010Ö\u0001R\u0017\u0010Ø\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010[R\u0019\u0010Û\u0001\u001a\u00030Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010Ú\u0001R0\u0010Ý\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\t\u0012\u00070Ü\u0001R\u00020\u00000·\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b>\u0010¹\u0001R6\u0010ß\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010Þ\u0001R6\u0010à\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010Þ\u0001R$\u0010á\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010¹\u0001R\u0019\u0010ä\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001e\u0010è\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R!\u0010í\u0001\u001a\u00030\u0094\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R\u001e\u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R#\u0010ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060ò\u00018\u0006¢\u0006\u0010\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bæ\u0001\u0010õ\u0001R\u0017\u0010ø\u0001\u001a\u00020 8BX\u0082\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010÷\u0001R(\u0010e\u001a\u00020d2\u0006\u0010e\u001a\u00020d8W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bó\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R,\u0010ü\u0001\u001a\u00030Ù\u00012\b\u0010ü\u0001\u001a\u00030Ù\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bã\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R\u0019\u0010\u0081\u0002\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010\u0080\u0002R\u0019\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010\u0082\u0002¨\u0006\u0084\u0002"}, d2 = {"Li4/k;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Li4/h;", "child", "parent", "", "O", "(Li4/h;Li4/h;)V", "Li4/B;", "Li4/p;", "", "entries", "Li4/w;", "navOptions", "Li4/B$a;", "navigatorExtras", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "backStackEntry", "handler", "U", "(Li4/B;Ljava/util/List;Li4/w;Li4/B$a;Lkotlin/jvm/functions/Function1;)V", "popUpTo", "", "saveState", "b0", "(Li4/B;Li4/h;ZLkotlin/jvm/functions/Function1;)V", "", "destinationId", "inclusive", "c0", "(IZZ)Z", "", PlaceTypes.ROUTE, "d0", "(Ljava/lang/String;ZZ)Z", "popOperations", "foundDestination", "u", "(Ljava/util/List;Li4/p;ZZ)Z", "Lkotlin/collections/ArrayDeque;", "Li4/i;", "savedState", "f0", "(Li4/h;ZLkotlin/collections/ArrayDeque;)V", "r", "(I)Z", "p0", "()Z", "q0", "t", "Landroid/os/Bundle;", "startDestinationArgs", "W", "(Landroid/os/Bundle;)V", "", "deepLink", "y", "([I)Ljava/lang/String;", "x", "(Li4/p;I)Li4/p;", "node", "args", "Q", "(Li4/p;Landroid/os/Bundle;Li4/w;Li4/B$a;)V", "M", "(Li4/p;Landroid/os/Bundle;)Z", PreferencesHelper.PREF_ID, "j0", "(ILandroid/os/Bundle;Li4/w;Li4/B$a;)Z", "v", "(Ljava/util/List;Landroid/os/Bundle;Li4/w;Li4/B$a;)Z", "backStackState", "L", "(Lkotlin/collections/ArrayDeque;)Ljava/util/List;", "finalArgs", "restoredEntries", "p", "(Li4/p;Landroid/os/Bundle;Li4/h;Ljava/util/List;)V", "t0", "()V", "r0", "(Li4/h;)Li4/h;", "X", "Y", "(IZ)Z", "Z", "Lkotlin/Function0;", "onComplete", "a0", "(Li4/h;Lkotlin/jvm/functions/Function0;)V", "V", "s0", "h0", "()Ljava/util/List;", "Li4/r;", "graph", "m0", "(Li4/r;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "K", "(Landroid/content/Intent;)Z", "w", "(I)Li4/p;", "Li4/o;", "request", "P", "(Li4/o;Li4/w;Li4/B$a;)V", "Li4/x;", "Lkotlin/ExtensionFunctionType;", "builder", "S", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "R", "(Ljava/lang/String;Li4/w;Li4/B$a;)V", "Li4/n;", "s", "()Li4/n;", "k0", "()Landroid/os/Bundle;", "navState", "i0", "Landroidx/lifecycle/s;", "owner", "n0", "(Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/g0;", "viewModelStore", "o0", "(Landroidx/lifecycle/g0;)V", "z", "(I)Li4/h;", "A", "(Ljava/lang/String;)Li4/h;", "a", "Landroid/content/Context;", "B", "()Landroid/content/Context;", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "Li4/v;", "c", "Li4/v;", "inflater", "d", "Li4/r;", "_graph", "e", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "f", "[Landroid/os/Parcelable;", "backStackToRestore", "g", "deepLinkHandled", "h", "Lkotlin/collections/ArrayDeque;", "backQueue", "Lpv/B;", "i", "Lpv/B;", "_currentBackStack", "Lpv/P;", "j", "Lpv/P;", "getCurrentBackStack", "()Lpv/P;", "currentBackStack", "k", "_visibleEntries", "l", "J", "visibleEntries", "", "m", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", "n", "parentToChildCount", "o", "backStackMap", "backStackStates", "q", "Landroidx/lifecycle/s;", "lifecycleOwner", "Li4/l;", "Li4/l;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Li4/k$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/l$b;", "Landroidx/lifecycle/l$b;", "H", "()Landroidx/lifecycle/l$b;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/l$b;)V", "hostLifecycleState", "Landroidx/lifecycle/r;", "Landroidx/lifecycle/r;", "lifecycleObserver", "Landroidx/activity/F;", "Landroidx/activity/F;", "onBackPressedCallback", "enableOnBackPressedCallback", "Li4/C;", "Li4/C;", "_navigatorProvider", "Li4/k$b;", "navigatorState", "Lkotlin/jvm/functions/Function1;", "addToBackStackHandler", "popFromBackStackHandler", "entrySavedState", "C", "I", "dispatchReentrantCount", "", "D", "Ljava/util/List;", "backStackEntriesToDispatch", "E", "Lkotlin/Lazy;", "getNavInflater", "()Li4/v;", "navInflater", "Lpv/A;", "F", "Lpv/A;", "_currentBackStackEntryFlow", "Lpv/f;", "G", "Lpv/f;", "()Lpv/f;", "currentBackStackEntryFlow", "()I", "destinationCountOnBackStack", "()Li4/r;", "l0", "(Li4/r;)V", "navigatorProvider", "()Li4/C;", "setNavigatorProvider", "(Li4/C;)V", "()Li4/p;", "currentDestination", "()Li4/h;", "currentBackStackEntry", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14670k {

    /* renamed from: I, reason: collision with root package name */
    private static boolean f137013I = true;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C14667h, Unit> popFromBackStackHandler;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Map<C14667h, Boolean> entrySavedState;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int dispatchReentrantCount;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final List<C14667h> backStackEntriesToDispatch;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy navInflater;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<C14667h> _currentBackStackEntryFlow;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<C14667h> currentBackStackEntryFlow;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Activity activity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C14681v inflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C14677r _graph;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Bundle navigatorStateToRestore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Parcelable[] backStackToRestore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean deepLinkHandled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<C14667h> backQueue;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<List<C14667h>> _currentBackStack;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final P<List<C14667h>> currentBackStack;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<List<C14667h>> _visibleEntries;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final P<List<C14667h>> visibleEntries;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Map<C14667h, C14667h> childToParentEntries;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Map<C14667h, AtomicInteger> parentToChildCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, String> backStackMap;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Map<String, ArrayDeque<C14668i>> backStackStates;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6172s lifecycleOwner;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private C14671l viewModel;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<c> onDestinationChangedListeners;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AbstractC6165l.b hostLifecycleState;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6171r lifecycleObserver;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final F onBackPressedCallback;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean enableOnBackPressedCallback;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C14657C _navigatorProvider;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Map<AbstractC14656B<? extends C14675p>, b> navigatorState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C14667h, Unit> addToBackStackHandler;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Li4/k$b;", "Li4/D;", "Li4/B;", "Li4/p;", "navigator", "<init>", "(Li4/k;Li4/B;)V", "Li4/h;", "backStackEntry", "", "i", "(Li4/h;)V", "m", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Li4/p;Landroid/os/Bundle;)Li4/h;", "popUpTo", "", "saveState", "g", "(Li4/h;Z)V", "h", "entry", "e", "Li4/B;", "getNavigator", "()Li4/B;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: i4.k$b */
    private final class b extends AbstractC14658D {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final AbstractC14656B<? extends C14675p> navigator;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C14670k f137048h;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: i4.k$b$a */
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C14667h f137050g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f137051h;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C14667h c14667h, boolean z10) {
                super(0);
                this.f137050g = c14667h;
                this.f137051h = z10;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.super.g(this.f137050g, this.f137051h);
            }
        }

        public b(C14670k c14670k, AbstractC14656B<? extends C14675p> navigator) {
            Intrinsics.j(navigator, "navigator");
            this.f137048h = c14670k;
            this.navigator = navigator;
        }

        @Override // kotlin.AbstractC14658D
        public C14667h a(C14675p destination, Bundle arguments) {
            Intrinsics.j(destination, "destination");
            return C14667h.Companion.b(C14667h.INSTANCE, this.f137048h.getContext(), destination, arguments, this.f137048h.H(), this.f137048h.viewModel, null, null, 96, null);
        }

        @Override // kotlin.AbstractC14658D
        public void e(C14667h entry) {
            C14671l c14671l;
            Intrinsics.j(entry, "entry");
            boolean zE = Intrinsics.e(this.f137048h.entrySavedState.get(entry), Boolean.TRUE);
            super.e(entry);
            this.f137048h.entrySavedState.remove(entry);
            if (this.f137048h.backQueue.contains(entry)) {
                if (getIsNavigating()) {
                    return;
                }
                this.f137048h.s0();
                this.f137048h._currentBackStack.b(CollectionsKt.m1(this.f137048h.backQueue));
                this.f137048h._visibleEntries.b(this.f137048h.h0());
                return;
            }
            this.f137048h.r0(entry);
            if (entry.getLifecycle().getState().b(AbstractC6165l.b.f55501c)) {
                entry.k(AbstractC6165l.b.f55499a);
            }
            ArrayDeque arrayDeque = this.f137048h.backQueue;
            if (arrayDeque == null || !arrayDeque.isEmpty()) {
                Iterator<E> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.e(((C14667h) it.next()).getId(), entry.getId())) {
                        break;
                    }
                }
                if (!zE && (c14671l = this.f137048h.viewModel) != null) {
                    c14671l.n(entry.getId());
                }
            } else if (!zE) {
                c14671l.n(entry.getId());
            }
            this.f137048h.s0();
            this.f137048h._visibleEntries.b(this.f137048h.h0());
        }

        @Override // kotlin.AbstractC14658D
        public void g(C14667h popUpTo, boolean saveState) throws Resources.NotFoundException {
            Intrinsics.j(popUpTo, "popUpTo");
            AbstractC14656B abstractC14656BE = this.f137048h._navigatorProvider.e(popUpTo.getDestination().getNavigatorName());
            if (!Intrinsics.e(abstractC14656BE, this.navigator)) {
                Object obj = this.f137048h.navigatorState.get(abstractC14656BE);
                Intrinsics.g(obj);
                ((b) obj).g(popUpTo, saveState);
            } else {
                Function1 function1 = this.f137048h.popFromBackStackHandler;
                if (function1 == null) {
                    this.f137048h.a0(popUpTo, new a(popUpTo, saveState));
                } else {
                    function1.invoke(popUpTo);
                    super.g(popUpTo, saveState);
                }
            }
        }

        @Override // kotlin.AbstractC14658D
        public void h(C14667h popUpTo, boolean saveState) {
            Intrinsics.j(popUpTo, "popUpTo");
            super.h(popUpTo, saveState);
            this.f137048h.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
        }

        @Override // kotlin.AbstractC14658D
        public void i(C14667h backStackEntry) {
            Intrinsics.j(backStackEntry, "backStackEntry");
            AbstractC14656B abstractC14656BE = this.f137048h._navigatorProvider.e(backStackEntry.getDestination().getNavigatorName());
            if (!Intrinsics.e(abstractC14656BE, this.navigator)) {
                Object obj = this.f137048h.navigatorState.get(abstractC14656BE);
                if (obj != null) {
                    ((b) obj).i(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            Function1 function1 = this.f137048h.addToBackStackHandler;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                m(backStackEntry);
                return;
            }
            FS.log_i("NavController", "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
        }

        public final void m(C14667h backStackEntry) {
            Intrinsics.j(backStackEntry, "backStackEntry");
            super.i(backStackEntry);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Li4/k$c;", "", "Li4/k;", "controller", "Li4/p;", "destination", "Landroid/os/Bundle;", "arguments", "", "a", "(Li4/k;Li4/p;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.k$c */
    public interface c {
        void a(C14670k controller, C14675p destination, Bundle arguments);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$d */
    static final class d extends Lambda implements Function1<Context, Context> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f137052f = new d();

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
    static final class e extends Lambda implements Function1<C14683x, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f137053f = new e();

        e() {
            super(1);
        }

        public final void a(C14683x navOptions) {
            Intrinsics.j(navOptions, "$this$navOptions");
            navOptions.i(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14683x c14683x) {
            a(c14683x);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/h;", "entry", "", "a", "(Li4/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$f */
    static final class f extends Lambda implements Function1<C14667h, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f137054f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f137055g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C14670k f137056h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f137057i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayDeque<C14668i> f137058j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, C14670k c14670k, boolean z10, ArrayDeque<C14668i> arrayDeque) {
            super(1);
            this.f137054f = booleanRef;
            this.f137055g = booleanRef2;
            this.f137056h = c14670k;
            this.f137057i = z10;
            this.f137058j = arrayDeque;
        }

        public final void a(C14667h entry) {
            Intrinsics.j(entry, "entry");
            this.f137054f.f143735a = true;
            this.f137055g.f143735a = true;
            this.f137056h.f0(entry, this.f137057i, this.f137058j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14667h c14667h) {
            a(c14667h);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/p;", "destination", "a", "(Li4/p;)Li4/p;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$g */
    static final class g extends Lambda implements Function1<C14675p, C14675p> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f137059f = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C14675p invoke(C14675p destination) {
            Intrinsics.j(destination, "destination");
            C14677r parent = destination.getParent();
            if (parent == null || parent.getStartDestId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/p;", "destination", "", "a", "(Li4/p;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$h */
    static final class h extends Lambda implements Function1<C14675p, Boolean> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C14675p destination) {
            Intrinsics.j(destination, "destination");
            return Boolean.valueOf(!C14670k.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/p;", "destination", "a", "(Li4/p;)Li4/p;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$i */
    static final class i extends Lambda implements Function1<C14675p, C14675p> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f137061f = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C14675p invoke(C14675p destination) {
            Intrinsics.j(destination, "destination");
            C14677r parent = destination.getParent();
            if (parent == null || parent.getStartDestId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/p;", "destination", "", "a", "(Li4/p;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$j */
    static final class j extends Lambda implements Function1<C14675p, Boolean> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C14675p destination) {
            Intrinsics.j(destination, "destination");
            return Boolean.valueOf(!C14670k.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/h;", "entry", "", "a", "(Li4/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$k, reason: collision with other inner class name */
    static final class C2161k extends Lambda implements Function1<C14667h, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f137063f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<C14667h> f137064g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f137065h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C14670k f137066i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Bundle f137067j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2161k(Ref.BooleanRef booleanRef, List<C14667h> list, Ref.IntRef intRef, C14670k c14670k, Bundle bundle) {
            super(1);
            this.f137063f = booleanRef;
            this.f137064g = list;
            this.f137065h = intRef;
            this.f137066i = c14670k;
            this.f137067j = bundle;
        }

        public final void a(C14667h entry) {
            List<C14667h> listM;
            Intrinsics.j(entry, "entry");
            this.f137063f.f143735a = true;
            int iIndexOf = this.f137064g.indexOf(entry);
            if (iIndexOf != -1) {
                int i10 = iIndexOf + 1;
                listM = this.f137064g.subList(this.f137065h.f143740a, i10);
                this.f137065h.f143740a = i10;
            } else {
                listM = CollectionsKt.m();
            }
            this.f137066i.p(entry.getDestination(), this.f137067j, entry, listM);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14667h c14667h) {
            a(c14667h);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/x;", "", "a", "(Li4/x;)V"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: i4.k$l */
    static final class l extends Lambda implements Function1<C14683x, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14675p f137068f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C14670k f137069g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/b;", "", "a", "(Li4/b;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: i4.k$l$a */
        static final class a extends Lambda implements Function1<C14661b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f137070f = new a();

            a() {
                super(1);
            }

            public final void a(C14661b anim) {
                Intrinsics.j(anim, "$this$anim");
                anim.e(0);
                anim.f(0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C14661b c14661b) {
                a(c14661b);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/E;", "", "a", "(Li4/E;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: i4.k$l$b */
        static final class b extends Lambda implements Function1<C14659E, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final b f137071f = new b();

            b() {
                super(1);
            }

            public final void a(C14659E popUpTo) {
                Intrinsics.j(popUpTo, "$this$popUpTo");
                popUpTo.d(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C14659E c14659e) {
                a(c14659e);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C14675p c14675p, C14670k c14670k) {
            super(1);
            this.f137068f = c14675p;
            this.f137069g = c14670k;
        }

        public final void a(C14683x navOptions) {
            Intrinsics.j(navOptions, "$this$navOptions");
            navOptions.a(a.f137070f);
            C14675p c14675p = this.f137068f;
            if (c14675p instanceof C14677r) {
                Sequence<C14675p> sequenceC = C14675p.INSTANCE.c(c14675p);
                C14670k c14670k = this.f137069g;
                for (C14675p c14675p2 : sequenceC) {
                    C14675p c14675pE = c14670k.E();
                    if (Intrinsics.e(c14675p2, c14675pE != null ? c14675pE.getParent() : null)) {
                        return;
                    }
                }
                if (C14670k.f137013I) {
                    navOptions.c(C14677r.INSTANCE.a(this.f137069g.G()).getId(), b.f137071f);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14683x c14683x) {
            a(c14683x);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li4/v;", "c", "()Li4/v;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$m */
    static final class m extends Lambda implements Function0<C14681v> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C14681v invoke() {
            C14681v c14681v = C14670k.this.inflater;
            return c14681v == null ? new C14681v(C14670k.this.getContext(), C14670k.this._navigatorProvider) : c14681v;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/h;", "it", "", "a", "(Li4/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$n */
    static final class n extends Lambda implements Function1<C14667h, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f137073f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C14670k f137074g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C14675p f137075h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Bundle f137076i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Ref.BooleanRef booleanRef, C14670k c14670k, C14675p c14675p, Bundle bundle) {
            super(1);
            this.f137073f = booleanRef;
            this.f137074g = c14670k;
            this.f137075h = c14675p;
            this.f137076i = bundle;
        }

        public final void a(C14667h it) {
            Intrinsics.j(it, "it");
            this.f137073f.f143735a = true;
            C14670k.q(this.f137074g, this.f137075h, this.f137076i, it, null, 8, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14667h c14667h) {
            a(c14667h);
            return Unit.f143329a;
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
            C14670k.this.X();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.k$p */
    static final class p extends Lambda implements Function1<String, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f137078f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.f137078f = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Intrinsics.e(str, this.f137078f));
        }
    }

    public boolean Y(int destinationId, boolean inclusive) {
        return Z(destinationId, inclusive, false);
    }

    public C14670k(Context context) {
        Object next;
        Intrinsics.j(context, "context");
        this.context = context;
        Iterator it = SequencesKt.q(context, d.f137052f).iterator();
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
        InterfaceC16549B<List<C14667h>> interfaceC16549BA = S.a(CollectionsKt.m());
        this._currentBackStack = interfaceC16549BA;
        this.currentBackStack = C16563h.c(interfaceC16549BA);
        InterfaceC16549B<List<C14667h>> interfaceC16549BA2 = S.a(CollectionsKt.m());
        this._visibleEntries = interfaceC16549BA2;
        this.visibleEntries = C16563h.c(interfaceC16549BA2);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = AbstractC6165l.b.f55500b;
        this.lifecycleObserver = new InterfaceC6169p() { // from class: i4.j
            @Override // androidx.view.InterfaceC6169p
            public final void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
                C14670k.N(this.f137011a, interfaceC6172s, aVar);
            }
        };
        this.onBackPressedCallback = new o();
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new C14657C();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        C14657C c14657c = this._navigatorProvider;
        c14657c.b(new C14679t(c14657c));
        this._navigatorProvider.b(new C14660a(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater = LazyKt.b(new m());
        InterfaceC16548A<C14667h> interfaceC16548AB = C16555H.b(1, 0, EnumC16325a.f155825b, 2, null);
        this._currentBackStackEntryFlow = interfaceC16548AB;
        this.currentBackStackEntryFlow = C16563h.b(interfaceC16548AB);
    }

    private final int F() {
        ArrayDeque<C14667h> arrayDeque = this.backQueue;
        int i10 = 0;
        if (arrayDeque != null && arrayDeque.isEmpty()) {
            return 0;
        }
        Iterator<C14667h> it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof C14677r) && (i10 = i10 + 1) < 0) {
                CollectionsKt.v();
            }
        }
        return i10;
    }

    private final List<C14667h> L(ArrayDeque<C14668i> backStackState) throws Resources.NotFoundException {
        C14675p c14675pG;
        ArrayList arrayList = new ArrayList();
        C14667h c14667hR = this.backQueue.r();
        if (c14667hR == null || (c14675pG = c14667hR.getDestination()) == null) {
            c14675pG = G();
        }
        if (backStackState != null) {
            for (C14668i c14668i : backStackState) {
                C14675p c14675pX = x(c14675pG, c14668i.getDestinationId());
                if (c14675pX == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + C14675p.INSTANCE.b(this.context, c14668i.getDestinationId()) + " cannot be found from the current destination " + c14675pG).toString());
                }
                arrayList.add(c14668i.c(this.context, c14675pX, H(), this.viewModel));
                c14675pG = c14675pX;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(C14670k this$0, InterfaceC6172s interfaceC6172s, AbstractC6165l.a event) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(interfaceC6172s, "<anonymous parameter 0>");
        Intrinsics.j(event, "event");
        this$0.hostLifecycleState = event.e();
        if (this$0._graph != null) {
            Iterator<C14667h> it = this$0.backQueue.iterator();
            while (it.hasNext()) {
                it.next().h(event);
            }
        }
    }

    private final void O(C14667h child, C14667h parent) {
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(parent);
        Intrinsics.g(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    private final void Q(C14675p node, Bundle args, C14682w navOptions, AbstractC14656B.a navigatorExtras) throws Resources.NotFoundException {
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
            booleanRef.f143735a = j0(node.getId(), bundleN, navOptions, navigatorExtras);
            z11 = false;
        } else {
            z11 = navOptions != null && navOptions.getSingleTop() && M(node, args);
            if (!z11) {
                U(this._navigatorProvider.e(node.getNavigatorName()), CollectionsKt.e(C14667h.Companion.b(C14667h.INSTANCE, this.context, node, bundleN, H(), this.viewModel, null, null, 96, null)), navOptions, navigatorExtras, new n(booleanRef, this, node, bundleN));
            }
        }
        t0();
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).k(false);
        }
        if (z10 || booleanRef.f143735a || z11) {
            t();
        } else {
            s0();
        }
    }

    public static /* synthetic */ void T(C14670k c14670k, String str, C14682w c14682w, AbstractC14656B.a aVar, int i10, Object obj) throws Resources.NotFoundException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            c14682w = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        c14670k.R(str, c14682w, aVar);
    }

    private final void U(AbstractC14656B<? extends C14675p> abstractC14656B, List<C14667h> list, C14682w c14682w, AbstractC14656B.a aVar, Function1<? super C14667h, Unit> function1) {
        this.addToBackStackHandler = function1;
        abstractC14656B.e(list, c14682w, aVar);
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
                C14657C c14657c = this._navigatorProvider;
                Intrinsics.i(name, "name");
                AbstractC14656B abstractC14656BE = c14657c.e(name);
                Bundle bundle2 = bundle.getBundle(name);
                if (bundle2 != null) {
                    abstractC14656BE.h(bundle2);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                Intrinsics.h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                C14668i c14668i = (C14668i) parcelable;
                C14675p c14675pW = w(c14668i.getDestinationId());
                if (c14675pW == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + C14675p.INSTANCE.b(this.context, c14668i.getDestinationId()) + " cannot be found from the current destination " + E());
                }
                C14667h c14667hC = c14668i.c(this.context, c14675pW, H(), this.viewModel);
                AbstractC14656B<? extends C14675p> abstractC14656BE2 = this._navigatorProvider.e(c14675pW.getNavigatorName());
                Map<AbstractC14656B<? extends C14675p>, b> map = this.navigatorState;
                b bVar = map.get(abstractC14656BE2);
                if (bVar == null) {
                    bVar = new b(this, abstractC14656BE2);
                    map.put(abstractC14656BE2, bVar);
                }
                this.backQueue.add(c14667hC);
                bVar.m(c14667hC);
                C14677r parent = c14667hC.getDestination().getParent();
                if (parent != null) {
                    O(c14667hC, z(parent.getId()));
                }
            }
            t0();
            this.backStackToRestore = null;
        }
        Collection<AbstractC14656B<? extends C14675p>> collectionValues = this._navigatorProvider.f().values();
        ArrayList<AbstractC14656B<? extends C14675p>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((AbstractC14656B) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (AbstractC14656B<? extends C14675p> abstractC14656B : arrayList) {
            Map<AbstractC14656B<? extends C14675p>, b> map2 = this.navigatorState;
            b bVar2 = map2.get(abstractC14656B);
            if (bVar2 == null) {
                bVar2 = new b(this, abstractC14656B);
                map2.put(abstractC14656B, bVar2);
            }
            abstractC14656B.f(bVar2);
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
        C14677r c14677r = this._graph;
        Intrinsics.g(c14677r);
        Q(c14677r, startDestinationArgs, null, null);
    }

    private final void b0(AbstractC14656B<? extends C14675p> abstractC14656B, C14667h c14667h, boolean z10, Function1<? super C14667h, Unit> function1) {
        this.popFromBackStackHandler = function1;
        abstractC14656B.j(c14667h, z10);
        this.popFromBackStackHandler = null;
    }

    private final boolean c0(int destinationId, boolean inclusive, boolean saveState) throws Resources.NotFoundException {
        C14675p destination;
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
            destination = ((C14667h) it.next()).getDestination();
            AbstractC14656B abstractC14656BE = this._navigatorProvider.e(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(abstractC14656BE);
            }
            if (destination.getId() == destinationId) {
                break;
            }
        }
        if (destination != null) {
            return u(arrayList, destination, inclusive, saveState);
        }
        FS.log_i("NavController", "Ignoring popBackStack to destination " + C14675p.INSTANCE.b(this.context, destinationId) + " as it was not found on the current back stack");
        return false;
    }

    private final boolean d0(String route, boolean inclusive, boolean saveState) {
        C14667h c14667hPrevious;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque<C14667h> arrayDeque = this.backQueue;
        ListIterator<C14667h> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c14667hPrevious = null;
                break;
            }
            c14667hPrevious = listIterator.previous();
            C14667h c14667h = c14667hPrevious;
            boolean zW = c14667h.getDestination().w(route, c14667h.c());
            if (inclusive || !zW) {
                arrayList.add(this._navigatorProvider.e(c14667h.getDestination().getNavigatorName()));
            }
            if (zW) {
                break;
            }
        }
        C14667h c14667h2 = c14667hPrevious;
        C14675p destination = c14667h2 != null ? c14667h2.getDestination() : null;
        if (destination != null) {
            return u(arrayList, destination, inclusive, saveState);
        }
        FS.log_i("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return false;
    }

    static /* synthetic */ boolean e0(C14670k c14670k, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return c14670k.c0(i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(C14667h popUpTo, boolean saveState, ArrayDeque<C14668i> savedState) {
        C14671l c14671l;
        P<Set<C14667h>> pC;
        Set<C14667h> value;
        C14667h c14667hLast = this.backQueue.last();
        if (!Intrinsics.e(c14667hLast, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + c14667hLast.getDestination() + ')').toString());
        }
        this.backQueue.removeLast();
        b bVar = this.navigatorState.get(get_navigatorProvider().e(c14667hLast.getDestination().getNavigatorName()));
        boolean z10 = true;
        if ((bVar == null || (pC = bVar.c()) == null || (value = pC.getValue()) == null || !value.contains(c14667hLast)) && !this.parentToChildCount.containsKey(c14667hLast)) {
            z10 = false;
        }
        AbstractC6165l.b state = c14667hLast.getLifecycle().getState();
        AbstractC6165l.b bVar2 = AbstractC6165l.b.f55501c;
        if (state.b(bVar2)) {
            if (saveState) {
                c14667hLast.k(bVar2);
                savedState.addFirst(new C14668i(c14667hLast));
            }
            if (z10) {
                c14667hLast.k(bVar2);
            } else {
                c14667hLast.k(AbstractC6165l.b.f55499a);
                r0(c14667hLast);
            }
        }
        if (saveState || z10 || (c14671l = this.viewModel) == null) {
            return;
        }
        c14671l.n(c14667hLast.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void g0(C14670k c14670k, C14667h c14667h, boolean z10, ArrayDeque arrayDeque, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            arrayDeque = new ArrayDeque();
        }
        c14670k.f0(c14667h, z10, arrayDeque);
    }

    private final boolean j0(int id2, Bundle args, C14682w navOptions, AbstractC14656B.a navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id2))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(id2));
        CollectionsKt.H(this.backStackMap.values(), new p(str));
        return v(L((ArrayDeque) TypeIntrinsics.d(this.backStackStates).remove(str)), args, navOptions, navigatorExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(C14675p node, Bundle finalArgs, C14667h backStackEntry, List<C14667h> restoredEntries) {
        Bundle bundle;
        ArrayDeque<C14667h> arrayDeque;
        C14675p destination;
        List<C14667h> list;
        C14667h c14667h;
        C14677r c14677r;
        C14667h c14667hPrevious;
        C14667h c14667hPrevious2;
        List<C14667h> list2 = restoredEntries;
        C14675p destination2 = backStackEntry.getDestination();
        if (!(destination2 instanceof InterfaceC14662c)) {
            while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof InterfaceC14662c) && e0(this, this.backQueue.last().getDestination().getId(), true, false, 4, null)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        C14667h c14667h2 = null;
        if (node instanceof C14677r) {
            C14675p c14675p = destination2;
            while (true) {
                Intrinsics.g(c14675p);
                C14677r parent = c14675p.getParent();
                if (parent != null) {
                    ListIterator<C14667h> listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c14667hPrevious2 = listIterator.previous();
                            if (Intrinsics.e(c14667hPrevious2.getDestination(), parent)) {
                                break;
                            }
                        } else {
                            c14667hPrevious2 = null;
                            break;
                        }
                    }
                    C14667h c14667hB = c14667hPrevious2;
                    if (c14667hB == null) {
                        bundle = finalArgs;
                        destination = destination2;
                        c14667hB = C14667h.Companion.b(C14667h.INSTANCE, this.context, parent, bundle, H(), this.viewModel, null, null, 96, null);
                    } else {
                        bundle = finalArgs;
                        destination = destination2;
                    }
                    arrayDeque2.addFirst(c14667hB);
                    if (this.backQueue.isEmpty() || this.backQueue.last().getDestination() != parent) {
                        c14667h = backStackEntry;
                        list = restoredEntries;
                        arrayDeque = arrayDeque2;
                    } else {
                        list = restoredEntries;
                        arrayDeque = arrayDeque2;
                        c14667h = backStackEntry;
                        g0(this, this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    bundle = finalArgs;
                    arrayDeque = arrayDeque2;
                    destination = destination2;
                    list = list2;
                    c14667h = backStackEntry;
                }
                if (parent == null || parent == node) {
                    break;
                }
                list2 = list;
                c14675p = parent;
                arrayDeque2 = arrayDeque;
                destination2 = destination;
            }
        } else {
            bundle = finalArgs;
            arrayDeque = arrayDeque2;
            destination = destination2;
            list = list2;
            c14667h = backStackEntry;
        }
        C14675p destination3 = arrayDeque.isEmpty() ? destination : ((C14667h) arrayDeque.first()).getDestination();
        while (destination3 != null && w(destination3.getId()) != destination3) {
            C14677r parent2 = destination3.getParent();
            if (parent2 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<C14667h> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        c14667hPrevious = listIterator2.previous();
                        if (Intrinsics.e(c14667hPrevious.getDestination(), parent2)) {
                            break;
                        }
                    } else {
                        c14667hPrevious = null;
                        break;
                    }
                }
                C14667h c14667hB2 = c14667hPrevious;
                if (c14667hB2 == null) {
                    c14677r = parent2;
                    c14667hB2 = C14667h.Companion.b(C14667h.INSTANCE, this.context, c14677r, parent2.n(bundle2), H(), this.viewModel, null, null, 96, null);
                } else {
                    c14677r = parent2;
                }
                arrayDeque.addFirst(c14667hB2);
            } else {
                c14677r = parent2;
            }
            destination3 = c14677r;
        }
        if (!arrayDeque.isEmpty()) {
            destination = ((C14667h) arrayDeque.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof C14677r)) {
            C14675p destination4 = this.backQueue.last().getDestination();
            Intrinsics.h(destination4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((C14677r) destination4).L(destination.getId(), false) != null) {
                break;
            } else {
                g0(this, this.backQueue.last(), false, null, 6, null);
            }
        }
        C14667h c14667hP = this.backQueue.p();
        if (c14667hP == null) {
            c14667hP = (C14667h) arrayDeque.p();
        }
        if (!Intrinsics.e(c14667hP != null ? c14667hP.getDestination() : null, this._graph)) {
            ListIterator<C14667h> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                C14667h c14667hPrevious3 = listIterator3.previous();
                C14675p destination5 = c14667hPrevious3.getDestination();
                C14677r c14677r2 = this._graph;
                Intrinsics.g(c14677r2);
                if (Intrinsics.e(destination5, c14677r2)) {
                    c14667h2 = c14667hPrevious3;
                    break;
                }
            }
            C14667h c14667hB3 = c14667h2;
            if (c14667hB3 == null) {
                C14667h.Companion companion = C14667h.INSTANCE;
                Context context = this.context;
                C14677r c14677r3 = this._graph;
                Intrinsics.g(c14677r3);
                C14677r c14677r4 = this._graph;
                Intrinsics.g(c14677r4);
                c14667hB3 = C14667h.Companion.b(companion, context, c14677r3, c14677r4.n(bundle), H(), this.viewModel, null, null, 96, null);
            }
            arrayDeque.addFirst(c14667hB3);
        }
        for (C14667h c14667h3 : arrayDeque) {
            b bVar = this.navigatorState.get(this._navigatorProvider.e(c14667h3.getDestination().getNavigatorName()));
            if (bVar == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
            bVar.m(c14667h3);
        }
        this.backQueue.addAll(arrayDeque);
        this.backQueue.add(c14667h);
        for (C14667h c14667h4 : CollectionsKt.Q0(arrayDeque, c14667h)) {
            C14677r parent3 = c14667h4.getDestination().getParent();
            if (parent3 != null) {
                O(c14667h4, z(parent3.getId()));
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
        List<Integer> listO1 = ArraysKt.o1(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int iIntValue = ((Number) CollectionsKt.M(listO1)).intValue();
        if (parcelableArrayList != null) {
        }
        if (listO1.isEmpty()) {
            return false;
        }
        C14675p c14675pX = x(G(), iIntValue);
        if (c14675pX instanceof C14677r) {
            iIntValue = C14677r.INSTANCE.a((C14677r) c14675pX).getId();
        }
        C14675p c14675pE = E();
        if (c14675pE == null || iIntValue != c14675pE.getId()) {
            return false;
        }
        C14673n c14673nS = s();
        Bundle bundleB = C14923c.b(TuplesKt.a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        c14673nS.e(bundleB);
        for (Object obj : listO1) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            c14673nS.a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        c14673nS.b().n();
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q(C14670k c14670k, C14675p c14675p, Bundle bundle, C14667h c14667h, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i10 & 8) != 0) {
            list = CollectionsKt.m();
        }
        c14670k.p(c14675p, bundle, c14667h, list);
    }

    private final boolean r(int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).k(true);
        }
        boolean zJ0 = j0(destinationId, null, C14684y.a(e.f137053f), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).k(false);
        }
        return zJ0 && c0(destinationId, true, false);
    }

    private final boolean t() {
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof C14677r)) {
            g0(this, this.backQueue.last(), false, null, 6, null);
        }
        C14667h c14667hR = this.backQueue.r();
        if (c14667hR != null) {
            this.backStackEntriesToDispatch.add(c14667hR);
        }
        this.dispatchReentrantCount++;
        s0();
        int i10 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i10;
        if (i10 == 0) {
            List<C14667h> listM1 = CollectionsKt.m1(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (C14667h c14667h : listM1) {
                Iterator<c> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().a(this, c14667h.getDestination(), c14667h.c());
                }
                this._currentBackStackEntryFlow.b(c14667h);
            }
            this._currentBackStack.b(CollectionsKt.m1(this.backQueue));
            this._visibleEntries.b(h0());
        }
        return c14667hR != null;
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C14670k.t0():void");
    }

    private final boolean u(List<? extends AbstractC14656B<?>> popOperations, C14675p foundDestination, boolean inclusive, boolean saveState) {
        C14670k c14670k;
        boolean z10;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayDeque<C14668i> arrayDeque = new ArrayDeque<>();
        Iterator<? extends AbstractC14656B<?>> it = popOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                c14670k = this;
                z10 = saveState;
                break;
            }
            AbstractC14656B<? extends C14675p> abstractC14656B = (AbstractC14656B) it.next();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            c14670k = this;
            z10 = saveState;
            b0(abstractC14656B, this.backQueue.last(), z10, new f(booleanRef2, booleanRef, c14670k, z10, arrayDeque));
            if (!booleanRef2.f143735a) {
                break;
            }
            saveState = z10;
        }
        if (z10) {
            if (!inclusive) {
                for (C14675p c14675p : SequencesKt.V(SequencesKt.q(foundDestination, g.f137059f), new h())) {
                    Map<Integer, String> map = c14670k.backStackMap;
                    Integer numValueOf = Integer.valueOf(c14675p.getId());
                    C14668i c14668iP = arrayDeque.p();
                    map.put(numValueOf, c14668iP != null ? c14668iP.getId() : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                C14668i c14668iFirst = arrayDeque.first();
                Iterator it2 = SequencesKt.V(SequencesKt.q(w(c14668iFirst.getDestinationId()), i.f137061f), new j()).iterator();
                while (it2.hasNext()) {
                    c14670k.backStackMap.put(Integer.valueOf(((C14675p) it2.next()).getId()), c14668iFirst.getId());
                }
                if (c14670k.backStackMap.values().contains(c14668iFirst.getId())) {
                    c14670k.backStackStates.put(c14668iFirst.getId(), arrayDeque);
                }
            }
        }
        t0();
        return booleanRef.f143735a;
    }

    private final boolean v(List<C14667h> entries, Bundle args, C14682w navOptions, AbstractC14656B.a navigatorExtras) {
        C14667h c14667h;
        C14675p destination;
        ArrayList<List<C14667h>> arrayList = new ArrayList();
        ArrayList<C14667h> arrayList2 = new ArrayList();
        for (Object obj : entries) {
            if (!(((C14667h) obj).getDestination() instanceof C14677r)) {
                arrayList2.add(obj);
            }
        }
        for (C14667h c14667h2 : arrayList2) {
            List list = (List) CollectionsKt.F0(arrayList);
            if (Intrinsics.e((list == null || (c14667h = (C14667h) CollectionsKt.D0(list)) == null || (destination = c14667h.getDestination()) == null) ? null : destination.getNavigatorName(), c14667h2.getDestination().getNavigatorName())) {
                list.add(c14667h2);
            } else {
                arrayList.add(CollectionsKt.s(c14667h2));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List<C14667h> list2 : arrayList) {
            U(this._navigatorProvider.e(((C14667h) CollectionsKt.s0(list2)).getDestination().getNavigatorName()), list2, navOptions, navigatorExtras, new C2161k(booleanRef, entries, new Ref.IntRef(), this, args));
        }
        return booleanRef.f143735a;
    }

    private final String y(int[] deepLink) {
        C14677r c14677r;
        C14677r c14677r2 = this._graph;
        int length = deepLink.length;
        int i10 = 0;
        while (true) {
            C14675p c14675pK = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = deepLink[i10];
            if (i10 == 0) {
                C14677r c14677r3 = this._graph;
                Intrinsics.g(c14677r3);
                if (c14677r3.getId() == i11) {
                    c14675pK = this._graph;
                }
            } else {
                Intrinsics.g(c14677r2);
                c14675pK = c14677r2.K(i11);
            }
            if (c14675pK == null) {
                return C14675p.INSTANCE.b(this.context, i11);
            }
            if (i10 != deepLink.length - 1 && (c14675pK instanceof C14677r)) {
                while (true) {
                    c14677r = (C14677r) c14675pK;
                    Intrinsics.g(c14677r);
                    if (!(c14677r.K(c14677r.getStartDestId()) instanceof C14677r)) {
                        break;
                    }
                    c14675pK = c14677r.K(c14677r.getStartDestId());
                }
                c14677r2 = c14677r;
            }
            i10++;
        }
    }

    public final C14667h A(String route) {
        C14667h c14667hPrevious;
        Intrinsics.j(route, "route");
        ArrayDeque<C14667h> arrayDeque = this.backQueue;
        ListIterator<C14667h> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c14667hPrevious = null;
                break;
            }
            c14667hPrevious = listIterator.previous();
            C14667h c14667h = c14667hPrevious;
            if (c14667h.getDestination().w(route, c14667h.c())) {
                break;
            }
        }
        C14667h c14667h2 = c14667hPrevious;
        if (c14667h2 != null) {
            return c14667h2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + E()).toString());
    }

    /* renamed from: B, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public C14667h C() {
        return this.backQueue.r();
    }

    public final InterfaceC16561f<C14667h> D() {
        return this.currentBackStackEntryFlow;
    }

    public C14677r G() {
        C14677r c14677r = this._graph;
        if (c14677r == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.h(c14677r, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return c14677r;
    }

    public final AbstractC6165l.b H() {
        return this.lifecycleOwner == null ? AbstractC6165l.b.f55501c : this.hostLifecycleState;
    }

    /* renamed from: I, reason: from getter */
    public C14657C get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public final P<List<C14667h>> J() {
        return this.visibleEntries;
    }

    public boolean K(Intent intent) throws Resources.NotFoundException {
        int[] intArray;
        C14675p c14675pK;
        C14677r c14677r;
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
            C14677r c14677r2 = this._graph;
            Intrinsics.g(c14677r2);
            C14675p.b bVarX = c14677r2.x(new C14674o(intent));
            if (bVarX != null) {
                C14675p destination = bVarX.getDestination();
                int[] iArrP = C14675p.p(destination, null, 1, null);
                Bundle bundleN = destination.n(bVarX.getMatchingArgs());
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
                C14677r c14677r3 = this._graph;
                Intrinsics.g(c14677r3);
                e0(this, c14677r3.getId(), true, false, 4, null);
            }
            while (i10 < intArray.length) {
                int i13 = intArray[i10];
                int i14 = i10 + 1;
                Bundle bundle5 = bundleArr[i10];
                C14675p c14675pW = w(i13);
                if (c14675pW == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + C14675p.INSTANCE.b(this.context, i13) + " cannot be found from the current destination " + E());
                }
                Q(c14675pW, bundle5, C14684y.a(new l(c14675pW, this)), null);
                i10 = i14;
            }
            this.deepLinkHandled = true;
            return true;
        }
        C14677r c14677r4 = this._graph;
        int length2 = intArray.length;
        for (int i15 = 0; i15 < length2; i15++) {
            int i16 = intArray[i15];
            Bundle bundle6 = bundleArr[i15];
            if (i15 == 0) {
                c14675pK = this._graph;
            } else {
                Intrinsics.g(c14677r4);
                c14675pK = c14677r4.K(i16);
            }
            if (c14675pK == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + C14675p.INSTANCE.b(this.context, i16) + " cannot be found in graph " + c14677r4);
            }
            if (i15 == intArray.length - 1) {
                C14682w.a aVar = new C14682w.a();
                C14677r c14677r5 = this._graph;
                Intrinsics.g(c14677r5);
                Q(c14675pK, bundle6, C14682w.a.i(aVar, c14677r5.getId(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (c14675pK instanceof C14677r) {
                while (true) {
                    c14677r = (C14677r) c14675pK;
                    Intrinsics.g(c14677r);
                    if (!(c14677r.K(c14677r.getStartDestId()) instanceof C14677r)) {
                        break;
                    }
                    c14675pK = c14677r.K(c14677r.getStartDestId());
                }
                c14677r4 = c14677r;
            }
        }
        this.deepLinkHandled = true;
        return true;
    }

    public void P(C14674o request, C14682w navOptions, AbstractC14656B.a navigatorExtras) throws Resources.NotFoundException {
        Intrinsics.j(request, "request");
        C14677r c14677r = this._graph;
        if (c14677r == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        Intrinsics.g(c14677r);
        C14675p.b bVarX = c14677r.x(request);
        if (bVarX == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        Bundle bundleN = bVarX.getDestination().n(bVarX.getMatchingArgs());
        if (bundleN == null) {
            bundleN = new Bundle();
        }
        C14675p destination = bVarX.getDestination();
        Intent intent = new Intent();
        intent.setDataAndType(request.getUri(), request.getMimeType());
        intent.setAction(request.getAction());
        bundleN.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        Q(destination, bundleN, navOptions, navigatorExtras);
    }

    @JvmOverloads
    public final void R(String route, C14682w navOptions, AbstractC14656B.a navigatorExtras) throws Resources.NotFoundException {
        Intrinsics.j(route, "route");
        C14674o.a.Companion companion = C14674o.a.INSTANCE;
        Uri uri = Uri.parse(C14675p.INSTANCE.a(route));
        Intrinsics.f(uri, "Uri.parse(this)");
        P(companion.a(uri).a(), navOptions, navigatorExtras);
    }

    public final void S(String route, Function1<? super C14683x, Unit> builder) throws Resources.NotFoundException {
        Intrinsics.j(route, "route");
        Intrinsics.j(builder, "builder");
        T(this, route, C14684y.a(builder), null, 4, null);
    }

    public boolean X() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        C14675p c14675pE = E();
        Intrinsics.g(c14675pE);
        return Y(c14675pE.getId(), true);
    }

    public final void a0(C14667h popUpTo, Function0<Unit> onComplete) throws Resources.NotFoundException {
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

    public final List<C14667h> h0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<C14667h> value = ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                C14667h c14667h = (C14667h) obj;
                if (!arrayList.contains(c14667h) && !c14667h.getMaxLifecycle().b(AbstractC6165l.b.f55502d)) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt.C(arrayList, arrayList2);
        }
        ArrayDeque<C14667h> arrayDeque = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (C14667h c14667h2 : arrayDeque) {
            C14667h c14667h3 = c14667h2;
            if (!arrayList.contains(c14667h3) && c14667h3.getMaxLifecycle().b(AbstractC6165l.b.f55502d)) {
                arrayList3.add(c14667h2);
            }
        }
        CollectionsKt.C(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((C14667h) obj2).getDestination() instanceof C14677r)) {
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
                    Map<String, ArrayDeque<C14668i>> map = this.backStackStates;
                    Intrinsics.i(id2, "id");
                    ArrayDeque<C14668i> arrayDeque = new ArrayDeque<>(parcelableArray.length);
                    Iterator itA = ArrayIteratorKt.a(parcelableArray);
                    while (itA.hasNext()) {
                        Parcelable parcelable = (Parcelable) itA.next();
                        Intrinsics.h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        arrayDeque.add((C14668i) parcelable);
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
        for (Map.Entry<String, AbstractC14656B<? extends C14675p>> entry : this._navigatorProvider.f().entrySet()) {
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
            Iterator<C14667h> it = this.backQueue.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new C14668i(it.next());
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
            for (Map.Entry<String, ArrayDeque<C14668i>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                ArrayDeque<C14668i> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i12 = 0;
                for (C14668i c14668i : value2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.w();
                    }
                    parcelableArr2[i12] = c14668i;
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

    public void l0(C14677r graph) throws Resources.NotFoundException {
        Intrinsics.j(graph, "graph");
        m0(graph, null);
    }

    public void m0(C14677r graph, Bundle startDestinationArgs) throws Resources.NotFoundException {
        C14670k c14670k;
        Intrinsics.j(graph, "graph");
        if (!Intrinsics.e(this._graph, graph)) {
            C14677r c14677r = this._graph;
            if (c14677r != null) {
                for (Integer id2 : new ArrayList(this.backStackMap.keySet())) {
                    Intrinsics.i(id2, "id");
                    r(id2.intValue());
                }
                c14670k = this;
                e0(c14670k, c14677r.getId(), true, false, 4, null);
            } else {
                c14670k = this;
            }
            c14670k._graph = graph;
            W(startDestinationArgs);
            return;
        }
        int iM = graph.P().m();
        for (int i10 = 0; i10 < iM; i10++) {
            C14675p c14675pN = graph.P().n(i10);
            C14677r c14677r2 = this._graph;
            Intrinsics.g(c14677r2);
            int i11 = c14677r2.P().i(i10);
            C14677r c14677r3 = this._graph;
            Intrinsics.g(c14677r3);
            c14677r3.P().l(i11, c14675pN);
        }
        for (C14667h c14667h : this.backQueue) {
            List<C14675p> listT = CollectionsKt.T(SequencesKt.X(C14675p.INSTANCE.c(c14667h.getDestination())));
            C14675p c14675pK = this._graph;
            Intrinsics.g(c14675pK);
            for (C14675p c14675p : listT) {
                if (!Intrinsics.e(c14675p, this._graph) || !Intrinsics.e(c14675pK, graph)) {
                    if (c14675pK instanceof C14677r) {
                        c14675pK = ((C14677r) c14675pK).K(c14675p.getId());
                        Intrinsics.g(c14675pK);
                    }
                }
            }
            c14667h.j(c14675pK);
        }
    }

    public void n0(InterfaceC6172s owner) {
        AbstractC6165l lifecycle;
        Intrinsics.j(owner, "owner");
        if (Intrinsics.e(owner, this.lifecycleOwner)) {
            return;
        }
        InterfaceC6172s interfaceC6172s = this.lifecycleOwner;
        if (interfaceC6172s != null && (lifecycle = interfaceC6172s.getLifecycle()) != null) {
            lifecycle.d(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().a(this.lifecycleObserver);
    }

    public void o0(g0 viewModelStore) {
        Intrinsics.j(viewModelStore, "viewModelStore");
        C14671l c14671l = this.viewModel;
        C14671l.Companion bVar = C14671l.INSTANCE;
        if (Intrinsics.e(c14671l, bVar.a(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = bVar.a(viewModelStore);
    }

    public final C14667h r0(C14667h child) {
        Intrinsics.j(child, "child");
        C14667h c14667hRemove = this.childToParentEntries.remove(child);
        if (c14667hRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(c14667hRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            b bVar = this.navigatorState.get(this._navigatorProvider.e(c14667hRemove.getDestination().getNavigatorName()));
            if (bVar != null) {
                bVar.e(c14667hRemove);
            }
            this.parentToChildCount.remove(c14667hRemove);
        }
        return c14667hRemove;
    }

    public C14673n s() {
        return new C14673n(this);
    }

    public final void s0() {
        AtomicInteger atomicInteger;
        P<Set<C14667h>> pC;
        Set<C14667h> value;
        List<C14667h> listM1 = CollectionsKt.m1(this.backQueue);
        if (listM1.isEmpty()) {
            return;
        }
        C14675p destination = ((C14667h) CollectionsKt.D0(listM1)).getDestination();
        ArrayList arrayList = new ArrayList();
        if (destination instanceof InterfaceC14662c) {
            Iterator it = CollectionsKt.S0(listM1).iterator();
            while (it.hasNext()) {
                C14675p destination2 = ((C14667h) it.next()).getDestination();
                arrayList.add(destination2);
                if (!(destination2 instanceof InterfaceC14662c) && !(destination2 instanceof C14677r)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C14667h c14667h : CollectionsKt.S0(listM1)) {
            AbstractC6165l.b maxLifecycle = c14667h.getMaxLifecycle();
            C14675p destination3 = c14667h.getDestination();
            if (destination != null && destination3.getId() == destination.getId()) {
                AbstractC6165l.b bVar = AbstractC6165l.b.f55503e;
                if (maxLifecycle != bVar) {
                    b bVar2 = this.navigatorState.get(get_navigatorProvider().e(c14667h.getDestination().getNavigatorName()));
                    if (Intrinsics.e((bVar2 == null || (pC = bVar2.c()) == null || (value = pC.getValue()) == null) ? null : Boolean.valueOf(value.contains(c14667h)), Boolean.TRUE) || ((atomicInteger = this.parentToChildCount.get(c14667h)) != null && atomicInteger.get() == 0)) {
                        map.put(c14667h, AbstractC6165l.b.f55502d);
                    } else {
                        map.put(c14667h, bVar);
                    }
                }
                C14675p c14675p = (C14675p) CollectionsKt.u0(arrayList);
                if (c14675p != null && c14675p.getId() == destination3.getId()) {
                    CollectionsKt.K(arrayList);
                }
                destination = destination.getParent();
            } else if (arrayList.isEmpty() || destination3.getId() != ((C14675p) CollectionsKt.s0(arrayList)).getId()) {
                c14667h.k(AbstractC6165l.b.f55501c);
            } else {
                C14675p c14675p2 = (C14675p) CollectionsKt.K(arrayList);
                if (maxLifecycle == AbstractC6165l.b.f55503e) {
                    c14667h.k(AbstractC6165l.b.f55502d);
                } else {
                    AbstractC6165l.b bVar3 = AbstractC6165l.b.f55502d;
                    if (maxLifecycle != bVar3) {
                        map.put(c14667h, bVar3);
                    }
                }
                C14677r parent = c14675p2.getParent();
                if (parent != null && !arrayList.contains(parent)) {
                    arrayList.add(parent);
                }
            }
        }
        for (C14667h c14667h2 : listM1) {
            AbstractC6165l.b bVar4 = (AbstractC6165l.b) map.get(c14667h2);
            if (bVar4 != null) {
                c14667h2.k(bVar4);
            } else {
                c14667h2.l();
            }
        }
    }

    public final C14675p w(int destinationId) {
        C14675p destination;
        C14677r c14677r = this._graph;
        if (c14677r == null) {
            return null;
        }
        Intrinsics.g(c14677r);
        if (c14677r.getId() == destinationId) {
            return this._graph;
        }
        C14667h c14667hR = this.backQueue.r();
        if (c14667hR == null || (destination = c14667hR.getDestination()) == null) {
            destination = this._graph;
            Intrinsics.g(destination);
        }
        return x(destination, destinationId);
    }

    public C14667h z(int destinationId) {
        C14667h c14667hPrevious;
        ArrayDeque<C14667h> arrayDeque = this.backQueue;
        ListIterator<C14667h> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c14667hPrevious = null;
                break;
            }
            c14667hPrevious = listIterator.previous();
            if (c14667hPrevious.getDestination().getId() == destinationId) {
                break;
            }
        }
        C14667h c14667h = c14667hPrevious;
        if (c14667h != null) {
            return c14667h;
        }
        throw new IllegalArgumentException(("No destination with ID " + destinationId + " is on the NavController's back stack. The current destination is " + E()).toString());
    }

    private final boolean M(C14675p node, Bundle args) {
        int id2;
        C14675p destination;
        int iNextIndex;
        C14667h c14667hC = C();
        if (node instanceof C14677r) {
            id2 = C14677r.INSTANCE.a((C14677r) node).getId();
        } else {
            id2 = node.getId();
        }
        if (c14667hC != null && (destination = c14667hC.getDestination()) != null && id2 == destination.getId()) {
            ArrayDeque<C14667h> arrayDeque = new ArrayDeque();
            ArrayDeque<C14667h> arrayDeque2 = this.backQueue;
            ListIterator<C14667h> listIterator = arrayDeque2.listIterator(arrayDeque2.size());
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
                C14667h c14667hRemoveLast = this.backQueue.removeLast();
                r0(c14667hRemoveLast);
                arrayDeque.addFirst(new C14667h(c14667hRemoveLast, c14667hRemoveLast.getDestination().n(args)));
            }
            for (C14667h c14667h : arrayDeque) {
                C14677r parent = c14667h.getDestination().getParent();
                if (parent != null) {
                    O(c14667h, z(parent.getId()));
                }
                this.backQueue.add(c14667h);
            }
            for (C14667h c14667h2 : arrayDeque) {
                this._navigatorProvider.e(c14667h2.getDestination().getNavigatorName()).g(c14667h2);
            }
            return true;
        }
        return false;
    }

    private final boolean q0() {
        Bundle matchingArgs;
        C14675p c14675pE = E();
        Intrinsics.g(c14675pE);
        int id2 = c14675pE.getId();
        for (C14677r parent = c14675pE.getParent(); parent != null; parent = parent.getParent()) {
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
                            C14677r c14677r = this._graph;
                            Intrinsics.g(c14677r);
                            Activity activity4 = this.activity;
                            Intrinsics.g(activity4);
                            Intent intent = activity4.getIntent();
                            Intrinsics.i(intent, "activity!!.intent");
                            C14675p.b bVarX = c14677r.x(new C14674o(intent));
                            if (bVarX != null) {
                                matchingArgs = bVarX.getMatchingArgs();
                            } else {
                                matchingArgs = null;
                            }
                            if (matchingArgs != null) {
                                bundle.putAll(bVarX.getDestination().n(bVarX.getMatchingArgs()));
                            }
                        }
                    }
                }
                C14673n.g(new C14673n(this), parent.getId(), null, 2, null).e(bundle).b().n();
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

    private final C14675p x(C14675p c14675p, int i10) {
        C14677r parent;
        if (c14675p.getId() == i10) {
            return c14675p;
        }
        if (c14675p instanceof C14677r) {
            parent = (C14677r) c14675p;
        } else {
            parent = c14675p.getParent();
            Intrinsics.g(parent);
        }
        return parent.K(i10);
    }

    public C14675p E() {
        C14667h c14667hC = C();
        if (c14667hC != null) {
            return c14667hC.getDestination();
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
