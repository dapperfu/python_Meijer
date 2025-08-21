package androidx.compose.ui.platform;

import Z.AbstractC5617o;
import Z.AbstractC5619q;
import Z.C5604b;
import Z.C5618p;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.C5968w;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6172s;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import io.constructor.data.local.PreferencesHelper;
import j1.C14920a;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import q2.y;
import r1.AccessibilityAction;
import r1.C16820n;
import r1.C16821o;
import r1.ScrollAxisRange;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\n\u0098\u0001±\u0002\u009e\u0001¢\u0001ª\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u0004\u0018\u00010\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010 J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010'J=\u0010.\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0003¢\u0006\u0004\b4\u00105J?\u0010;\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u000b2\b\u00107\u001a\u0004\u0018\u00010\u000b2\b\u00108\u001a\u0004\u0018\u00010\u000b2\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b=\u0010'J)\u0010A\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bA\u0010BJ1\u0010D\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010C\u001a\u00020,2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bD\u0010EJ#\u0010J\u001a\u0004\u0018\u00010I2\b\u0010F\u001a\u0004\u0018\u00010\u001a2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bL\u0010MJ/\u0010O\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00104*\u0002092\b\u0010:\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010N\u001a\u00020\u000bH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bU\u0010TJ\u001f\u0010X\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020Q2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u001cH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\\\u0010[J\u001d\u0010^\u001a\u00020\u001c2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b^\u0010_J%\u0010c\u001a\u00020\t2\u0006\u0010`\u001a\u00020\u000b2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0+H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u001c2\u0006\u0010e\u001a\u00020aH\u0002¢\u0006\u0004\bf\u0010gJ)\u0010j\u001a\u00020\u001c2\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\b\u0010i\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\bj\u0010kJ\u001f\u0010o\u001a\u00020\u001c2\u0006\u0010l\u001a\u00020\u001a2\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000bH\u0002¢\u0006\u0004\bq\u0010rJ/\u0010v\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\t2\u0006\u0010u\u001a\u00020\tH\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u001c2\u0006\u0010h\u001a\u00020\u000bH\u0002¢\u0006\u0004\bx\u0010MJ/\u0010|\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010y\u001a\u00020\u000b2\u0006\u0010z\u001a\u00020\u000b2\u0006\u0010{\u001a\u00020\tH\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001aH\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0019\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u001a\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001aH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J'\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u001a2\u0006\u0010s\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001e\u0010\u0086\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0019\u0010\u0089\u0001\u001a\u0004\u0018\u00010!*\u00030\u0088\u0001H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J-\u0010\u008b\u0001\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001b\u0010\u008e\u0001\u001a\u00020\t2\u0007\u00101\u001a\u00030\u008d\u0001H\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J&\u0010\u0093\u0001\u001a\u00020\u000b2\b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\b\u0010\u0092\u0001\u001a\u00030\u0090\u0001H\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u001cH\u0000¢\u0006\u0005\b\u009a\u0001\u0010[J\u0013\u0010\u009b\u0001\u001a\u00020\u001cH\u0080@¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0019\u0010\u009d\u0001\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020QH\u0000¢\u0006\u0005\b\u009d\u0001\u0010TR\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R/\u0010¨\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0005\b§\u0001\u0010[\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0005\b¦\u0001\u0010MR=\u0010±\u0001\u001a\u000f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0©\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bª\u0001\u0010«\u0001\u0012\u0005\b°\u0001\u0010[\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010µ\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R1\u0010¼\u0001\u001a\u00020\t2\u0007\u0010¶\u0001\u001a\u00020\t8\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0005\b·\u0001\u0010~\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R*\u0010Ä\u0001\u001a\u00030½\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010È\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ì\u0001\u001a\u00030É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001RE\u0010Ò\u0001\u001a.\u0012\u000f\u0012\r Ï\u0001*\u0005\u0018\u00010Î\u00010Î\u0001 Ï\u0001*\u0015\u0012\u000f\u0012\r Ï\u0001*\u0005\u0018\u00010Î\u00010Î\u0001\u0018\u00010+0Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u001e\u0010Ú\u0001\u001a\u00070×\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010£\u0001R\u0019\u0010Þ\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010£\u0001R\u001b\u0010á\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001b\u0010ã\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010à\u0001R\u0018\u0010å\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bä\u0001\u0010~R\u001f\u0010ê\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001f\u0010ì\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010é\u0001R'\u0010ð\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090í\u00010í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R'\u0010ó\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090ñ\u00010í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010ï\u0001R\u0019\u0010ô\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010£\u0001R\u001b\u0010ö\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010õ\u0001R\u001e\u0010ú\u0001\u001a\t\u0012\u0004\u0012\u00020Q0÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u001e\u0010þ\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u0018\u0010\u0080\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÿ\u0001\u0010~R\u001c\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R\u0019\u0010\u008b\u0002\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R*\u0010\u0093\u0002\u001a\u00030\u008c\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010\u008e\u0002\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R*\u0010\u0097\u0002\u001a\u00030\u008c\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0094\u0002\u0010\u008e\u0002\u001a\u0006\b\u0095\u0002\u0010\u0090\u0002\"\u0006\b\u0096\u0002\u0010\u0092\u0002R\u001f\u0010\u009c\u0002\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0098\u0002\u0010\u0099\u0002\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u001f\u0010\u009e\u0002\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0099\u0002\u001a\u0006\b\u009d\u0002\u0010\u009b\u0002R\u0018\u0010¡\u0002\u001a\u00030\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010 \u0002R \u0010£\u0002\u001a\t\u0012\u0004\u0012\u00020m0æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010é\u0001R\u0019\u0010¦\u0002\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R\u0017\u0010§\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010~R\u0017\u0010ª\u0002\u001a\u00030¨\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010©\u0002R\u001e\u0010«\u0002\u001a\t\u0012\u0004\u0012\u00020a0Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010Ñ\u0001R$\u0010¬\u0002\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u001c0©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010«\u0001R\u0017\u0010®\u0002\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0002\u0010¹\u0001R\u0017\u0010°\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¯\u0002\u0010¹\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006²\u0002"}, d2 = {"Landroidx/compose/ui/platform/v;", "Landroidx/core/view/a;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "LZ/q;", "Landroidx/compose/ui/platform/A1;", "currentSemanticsNodes", "", "vertical", "", "direction", "LU0/f;", "position", "Q", "(LZ/q;ZIJ)Z", "virtualViewId", "Lq2/y;", "U", "(I)Lq2/y;", "node", "Landroid/graphics/Rect;", "N", "(Landroidx/compose/ui/platform/A1;)Landroid/graphics/Rect;", "info", "Lr1/n;", "semanticsNode", "", "u0", "(ILq2/y;Lr1/n;)V", "M0", "(Lr1/n;Lq2/y;)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/SpannableString;", "Q0", "(Landroidx/compose/ui/text/AnnotatedString;)Landroid/text/SpannableString;", "O0", "k0", "(I)Z", "y0", "eventType", "contentChangeType", "", "", "contentDescription", "E0", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "D0", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "T", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "V", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "S", "action", "Landroid/os/Bundle;", "arguments", "r0", "(IILandroid/os/Bundle;)Z", "extraDataKey", "M", "(ILq2/y;Ljava/lang/String;Landroid/os/Bundle;)V", "textNode", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroid/graphics/RectF;", "P0", "(Lr1/n;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "U0", "(I)V", "size", "T0", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "o0", "(Landroidx/compose/ui/node/LayoutNode;)V", "K0", "LZ/L;", "subtreeChangedSemanticsNodesIds", "J0", "(Landroidx/compose/ui/node/LayoutNode;LZ/L;)V", "R", "()V", "V0", "newSemanticsNodes", "I0", "(LZ/q;)V", PreferencesHelper.PREF_ID, "Landroidx/compose/ui/platform/y1;", "oldScrollObservationScopes", "x0", "(ILjava/util/List;)Z", "scrollObservationScope", "z0", "(Landroidx/compose/ui/platform/y1;)V", "semanticsNodeId", "title", "G0", "(IILjava/lang/String;)V", "newNode", "Landroidx/compose/ui/platform/z1;", "oldNode", "C0", "(Lr1/n;Landroidx/compose/ui/platform/z1;)V", "B0", "(I)I", "granularity", "forward", "extendSelection", "S0", "(Lr1/n;IZZ)Z", "H0", "start", "end", "traversalMode", "L0", "(Lr1/n;IIZ)Z", "Z", "(Lr1/n;)I", "Y", "l0", "(Lr1/n;)Z", "Landroidx/compose/ui/platform/f;", "g0", "(Lr1/n;I)Landroidx/compose/ui/platform/f;", "f0", "(Lr1/n;)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "h0", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/AnnotatedString;", "P", "(ZIJ)Z", "Landroid/view/MotionEvent;", "W", "(Landroid/view/MotionEvent;)Z", "", "x", "y", "j0", "(FF)I", "Landroid/view/View;", "host", "Lq2/z;", "b", "(Landroid/view/View;)Lq2/z;", "q0", "O", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "d", "Landroidx/compose/ui/platform/AndroidComposeView;", "i0", "()Landroidx/compose/ui/platform/AndroidComposeView;", "e", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "getHoveredVirtualViewId$ui_release$annotations", "hoveredVirtualViewId", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/Function1;", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnSendAccessibilityEvent$ui_release$annotations", "onSendAccessibilityEvent", "Landroid/view/accessibility/AccessibilityManager;", "g", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "value", "h", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "", "i", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "N0", "(J)V", "SendRecurringAccessibilityEventsIntervalMillis", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "j", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "k", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "l", "Ljava/util/List;", "enabledServices", "Landroid/os/Handler;", "m", "Landroid/os/Handler;", "handler", "Landroidx/compose/ui/platform/v$e;", "n", "Landroidx/compose/ui/platform/v$e;", "nodeProvider", "o", "accessibilityFocusedVirtualViewId", "p", "focusedVirtualViewId", "q", "Lq2/y;", "currentlyAccessibilityFocusedANI", "r", "currentlyFocusedANI", "s", "sendingFocusAffectingEvent", "LZ/K;", "Lr1/i;", "t", "LZ/K;", "pendingHorizontalScrollEvents", "u", "pendingVerticalScrollEvents", "LZ/o0;", "v", "LZ/o0;", "actionIdToLabel", "LZ/S;", "w", "labelToActionId", "accessibilityCursorPosition", "Ljava/lang/Integer;", "previousTraversedNode", "LZ/b;", "z", "LZ/b;", "subtreeChangedLayoutNodes", "Lov/g;", "A", "Lov/g;", "boundsUpdateChannel", "B", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/v$f;", "C", "Landroidx/compose/ui/platform/v$f;", "pendingTextTraversedEvent", "D", "LZ/q;", "a0", "()LZ/q;", "E", "LZ/L;", "paneDisplayed", "LZ/I;", "F", "LZ/I;", "e0", "()LZ/I;", "setIdToBeforeMap$ui_release", "(LZ/I;)V", "idToBeforeMap", "G", "d0", "setIdToAfterMap$ui_release", "idToAfterMap", "H", "Ljava/lang/String;", "c0", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "b0", "ExtraDataTestTraversalAfterVal", "LC1/v;", "LC1/v;", "urlSpanCache", "K", "previousSemanticsNodes", "L", "Landroidx/compose/ui/platform/z1;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "n0", "isTouchExplorationEnabled", "m0", "isEnabled", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6039v extends androidx.core.view.a {

    /* renamed from: R, reason: collision with root package name */
    public static final int f52427R = 8;

    /* renamed from: S, reason: collision with root package name */
    private static final AbstractC5617o f52428S = C5618p.c(P0.k.f25227a, P0.k.f25228b, P0.k.f25239m, P0.k.f25250x, P0.k.f25215A, P0.k.f25216B, P0.k.f25217C, P0.k.f25218D, P0.k.f25219E, P0.k.f25220F, P0.k.f25229c, P0.k.f25230d, P0.k.f25231e, P0.k.f25232f, P0.k.f25233g, P0.k.f25234h, P0.k.f25235i, P0.k.f25236j, P0.k.f25237k, P0.k.f25238l, P0.k.f25240n, P0.k.f25241o, P0.k.f25242p, P0.k.f25243q, P0.k.f25244r, P0.k.f25245s, P0.k.f25246t, P0.k.f25247u, P0.k.f25248v, P0.k.f25249w, P0.k.f25251y, P0.k.f25252z);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final ov.g<Unit> boundsUpdateChannel;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private f pendingTextTraversedEvent;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private AbstractC5619q<A1> currentSemanticsNodes;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Z.L paneDisplayed;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Z.I idToBeforeMap;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private Z.I idToAfterMap;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final String ExtraDataTestTraversalBeforeVal;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final String ExtraDataTestTraversalAfterVal;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final C1.v urlSpanCache;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private Z.K<C6053z1> previousSemanticsNodes;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private C6053z1 previousSemanticsRoot;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Runnable semanticsChangeChecker;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final List<C6050y1> scrollObservationScopes;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final Function1<C6050y1, Unit> scheduleScrollEventIfNeededLambda;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView view;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int hoveredVirtualViewId = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new h();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AccessibilityManager accessibilityManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean accessibilityForceEnabledForTesting;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long SendRecurringAccessibilityEventsIntervalMillis;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private List<AccessibilityServiceInfo> enabledServices;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private e nodeProvider;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int accessibilityFocusedVirtualViewId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int focusedVirtualViewId;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private q2.y currentlyAccessibilityFocusedANI;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private q2.y currentlyFocusedANI;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean sendingFocusAffectingEvent;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Z.K<ScrollAxisRange> pendingHorizontalScrollEvents;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Z.K<ScrollAxisRange> pendingVerticalScrollEvents;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Z.o0<Z.o0<CharSequence>> actionIdToLabel;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Z.o0<Z.S<CharSequence>> labelToActionId;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int accessibilityCursorPosition;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Integer previousTraversedNode;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final C5604b<LayoutNode> subtreeChangedLayoutNodes;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/v$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$a */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = C6039v.this.accessibilityManager;
            C6039v c6039v = C6039v.this;
            accessibilityManager.addAccessibilityStateChangeListener(c6039v.enabledStateListener);
            accessibilityManager.addTouchExplorationStateChangeListener(c6039v.touchExplorationStateListener);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C6039v.this.handler.removeCallbacks(C6039v.this.semanticsChangeChecker);
            AccessibilityManager accessibilityManager = C6039v.this.accessibilityManager;
            C6039v c6039v = C6039v.this;
            accessibilityManager.removeAccessibilityStateChangeListener(c6039v.enabledStateListener);
            accessibilityManager.removeTouchExplorationStateChangeListener(c6039v.touchExplorationStateListener);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/v$e;", "Lq2/z;", "<init>", "(Landroidx/compose/ui/platform/v;)V", "", "virtualViewId", "Lq2/y;", "b", "(I)Lq2/y;", "action", "Landroid/os/Bundle;", "arguments", "", "f", "(IILandroid/os/Bundle;)Z", "info", "", "extraDataKey", "", "a", "(ILq2/y;Ljava/lang/String;Landroid/os/Bundle;)V", "focus", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$e */
    private final class e extends q2.z {
        @Override // q2.z
        public q2.y d(int focus) {
            if (focus == 1) {
                if (C6039v.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return b(C6039v.this.focusedVirtualViewId);
            }
            if (focus == 2) {
                return b(C6039v.this.accessibilityFocusedVirtualViewId);
            }
            throw new IllegalArgumentException("Unknown focus type: " + focus);
        }

        public e() {
        }

        @Override // q2.z
        public void a(int virtualViewId, q2.y info, String extraDataKey, Bundle arguments) {
            C6039v.this.M(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // q2.z
        public q2.y b(int virtualViewId) {
            q2.y yVarU = C6039v.this.U(virtualViewId);
            C6039v c6039v = C6039v.this;
            if (c6039v.sendingFocusAffectingEvent) {
                if (virtualViewId == c6039v.accessibilityFocusedVirtualViewId) {
                    c6039v.currentlyAccessibilityFocusedANI = yVarU;
                }
                if (virtualViewId == c6039v.focusedVirtualViewId) {
                    c6039v.currentlyFocusedANI = yVarU;
                }
            }
            return yVarU;
        }

        @Override // q2.z
        public boolean f(int virtualViewId, int action, Bundle arguments) {
            return C6039v.this.r0(virtualViewId, action, arguments);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/v$f;", "", "Lr1/n;", "node", "", "action", "granularity", "fromIndex", "toIndex", "", "traverseTime", "<init>", "(Lr1/n;IIIIJ)V", "a", "Lr1/n;", "d", "()Lr1/n;", "b", "I", "()I", "c", "e", "f", "J", "()J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$f */
    private static final class f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C16820n node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int action;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int granularity;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int fromIndex;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int toIndex;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final long traverseTime;

        /* renamed from: a, reason: from getter */
        public final int getAction() {
            return this.action;
        }

        /* renamed from: b, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* renamed from: c, reason: from getter */
        public final int getGranularity() {
            return this.granularity;
        }

        /* renamed from: d, reason: from getter */
        public final C16820n getNode() {
            return this.node;
        }

        /* renamed from: e, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        /* renamed from: f, reason: from getter */
        public final long getTraverseTime() {
            return this.traverseTime;
        }

        public f(C16820n c16820n, int i10, int i11, int i12, int i13, long j10) {
            this.node = c16820n;
            this.action = i10;
            this.granularity = i11;
            this.fromIndex = i12;
            this.toIndex = i13;
            this.traverseTime = j10;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1916, 1951}, m = "boundsUpdatesEventLoop$ui_release")
    /* renamed from: androidx.compose.ui.platform.v$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f52478a;

        /* renamed from: b, reason: collision with root package name */
        Object f52479b;

        /* renamed from: c, reason: collision with root package name */
        Object f52480c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f52481d;

        /* renamed from: f, reason: collision with root package name */
        int f52483f;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52481d = obj;
            this.f52483f |= Integer.MIN_VALUE;
            return C6039v.this.O(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/accessibility/AccessibilityEvent;", "it", "", "a", "(Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.v$h */
    static final class h extends Lambda implements Function1<AccessibilityEvent, Boolean> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(C6039v.this.getView().getParent().requestSendAccessibilityEvent(C6039v.this.getView(), accessibilityEvent));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$i */
    static final class i extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6050y1 f52485f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6039v f52486g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C6050y1 c6050y1, C6039v c6039v) {
            super(0);
            this.f52485f = c6050y1;
            this.f52486g = c6039v;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C16820n semanticsNode;
            LayoutNode layoutNode;
            ScrollAxisRange horizontalScrollAxisRange = this.f52485f.getHorizontalScrollAxisRange();
            ScrollAxisRange verticalScrollAxisRange = this.f52485f.getVerticalScrollAxisRange();
            Float oldXValue = this.f52485f.getOldXValue();
            Float oldYValue = this.f52485f.getOldYValue();
            float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.c().invoke().floatValue() - oldXValue.floatValue();
            float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.c().invoke().floatValue() - oldYValue.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iB0 = this.f52486g.B0(this.f52485f.getSemanticsNodeId());
                A1 a12 = (A1) this.f52486g.a0().b(this.f52486g.accessibilityFocusedVirtualViewId);
                if (a12 != null) {
                    C6039v c6039v = this.f52486g;
                    try {
                        q2.y yVar = c6039v.currentlyAccessibilityFocusedANI;
                        if (yVar != null) {
                            yVar.m0(c6039v.N(a12));
                            Unit unit = Unit.f143329a;
                        }
                    } catch (IllegalStateException unused) {
                        Unit unit2 = Unit.f143329a;
                    }
                }
                A1 a13 = (A1) this.f52486g.a0().b(this.f52486g.focusedVirtualViewId);
                if (a13 != null) {
                    C6039v c6039v2 = this.f52486g;
                    try {
                        q2.y yVar2 = c6039v2.currentlyFocusedANI;
                        if (yVar2 != null) {
                            yVar2.m0(c6039v2.N(a13));
                            Unit unit3 = Unit.f143329a;
                        }
                    } catch (IllegalStateException unused2) {
                        Unit unit4 = Unit.f143329a;
                    }
                }
                this.f52486g.getView().invalidate();
                A1 a14 = (A1) this.f52486g.a0().b(iB0);
                if (a14 != null && (semanticsNode = a14.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                    C6039v c6039v3 = this.f52486g;
                    if (horizontalScrollAxisRange != null) {
                        c6039v3.pendingHorizontalScrollEvents.r(iB0, horizontalScrollAxisRange);
                    }
                    if (verticalScrollAxisRange != null) {
                        c6039v3.pendingVerticalScrollEvents.r(iB0, verticalScrollAxisRange);
                    }
                    c6039v3.o0(layoutNode);
                }
            }
            if (horizontalScrollAxisRange != null) {
                this.f52485f.g(horizontalScrollAxisRange.c().invoke());
            }
            if (verticalScrollAxisRange != null) {
                this.f52485f.h(verticalScrollAxisRange.c().invoke());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/y1;", "it", "", "a", "(Landroidx/compose/ui/platform/y1;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.v$j */
    static final class j extends Lambda implements Function1<C6050y1, Unit> {
        j() {
            super(1);
        }

        public final void a(C6050y1 c6050y1) {
            C6039v.this.z0(c6050y1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6050y1 c6050y1) {
            a(c6050y1);
            return Unit.f143329a;
        }
    }

    private final RectF P0(C16820n textNode, Rect bounds) {
        if (textNode == null) {
            return null;
        }
        Rect rectT = bounds.t(textNode.s());
        Rect rectI = textNode.i();
        Rect rectP = rectT.r(rectI) ? rectT.p(rectI) : null;
        if (rectP == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.view;
        float left = rectP.getLeft();
        long jS = androidComposeView.s(U0.f.e((Float.floatToRawIntBits(rectP.getTop()) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        long jS2 = this.view.s(U0.f.e((Float.floatToRawIntBits(rectP.l()) << 32) | (Float.floatToRawIntBits(rectP.i()) & 4294967295L)));
        return new RectF(Float.intBitsToFloat((int) (jS >> 32)), Float.intBitsToFloat((int) (jS & 4294967295L)), Float.intBitsToFloat((int) (jS2 >> 32)), Float.intBitsToFloat((int) (jS2 & 4294967295L)));
    }

    private final String f0(C16820n node) {
        AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig.contains(semanticsProperties.getContentDescription())) {
            return J1.a.e((List) node.getUnmergedConfig().n(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().contains(semanticsProperties.getEditableText())) {
            AnnotatedString annotatedStringH0 = h0(node.getUnmergedConfig());
            if (annotatedStringH0 != null) {
                return annotatedStringH0.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.u0(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final InterfaceC5992f g0(C16820n node, int granularity) {
        String strF0;
        TextLayoutResult textLayoutResultE;
        if (node == null || (strF0 = f0(node)) == null || strF0.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            C5980b c5980bA = C5980b.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            c5980bA.e(strF0);
            return c5980bA;
        }
        if (granularity == 2) {
            C5995g c5995gA = C5995g.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            c5995gA.e(strF0);
            return c5995gA;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                C5989e c5989eA = C5989e.INSTANCE.a();
                c5989eA.e(strF0);
                return c5989eA;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!node.getUnmergedConfig().contains(SemanticsActions.INSTANCE.i()) || (textLayoutResultE = B1.e(node.getUnmergedConfig())) == null) {
            return null;
        }
        if (granularity == 4) {
            C5983c c5983cA = C5983c.INSTANCE.a();
            c5983cA.j(strF0, textLayoutResultE);
            return c5983cA;
        }
        C5986d c5986dA = C5986d.INSTANCE.a();
        c5986dA.j(strF0, textLayoutResultE, node);
        return c5986dA;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:97:0x01b7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01b6 -> B:97:0x01b7). Please report as a decompilation issue!!! */
    public final boolean r0(int r20, int r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C6039v.r0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean s0(ScrollAxisRange scrollAxisRange, float f10) {
        if (f10 >= 0.0f || scrollAxisRange.c().invoke().floatValue() <= 0.0f) {
            return f10 > 0.0f && scrollAxisRange.c().invoke().floatValue() < scrollAxisRange.a().invoke().floatValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u0(int r17, q2.y r18, r1.C16820n r19) {
        /*
            Method dump skipped, instructions count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C6039v.u0(int, q2.y, r1.n):void");
    }

    public final void p0(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (m0()) {
            o0(layoutNode);
        }
    }

    public final void q0() {
        this.currentSemanticsNodesInvalidated = true;
        if (!m0() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/v$b;", "", "<init>", "()V", "Lq2/y;", "info", "Lr1/n;", "semanticsNode", "", "a", "(Lq2/y;Lr1/n;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f52469a = new b();

        private b() {
        }

        @JvmStatic
        public static final void a(q2.y info, C16820n semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (C6045x.o(semanticsNode) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.x())) != null) {
                info.b(new y.a(R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/v$c;", "", "<init>", "()V", "Lq2/y;", "info", "Lr1/n;", "semanticsNode", "", "a", "(Lq2/y;Lr1/n;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f52470a = new c();

        private c() {
        }

        @JvmStatic
        public static final void a(q2.y info, C16820n semanticsNode) {
            boolean zM;
            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
            if (C6045x.o(semanticsNode)) {
                int iB = Role.INSTANCE.b();
                if (role == null) {
                    zM = false;
                } else {
                    zM = Role.m(role.getValue(), iB);
                }
                if (!zM) {
                    SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
                    SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                    AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsActions.r());
                    if (accessibilityAction != null) {
                        info.b(new y.a(R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                    }
                    AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.o());
                    if (accessibilityAction2 != null) {
                        info.b(new y.a(R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                    }
                    AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.p());
                    if (accessibilityAction3 != null) {
                        info.b(new y.a(R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                    }
                    AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.q());
                    if (accessibilityAction4 != null) {
                        info.b(new y.a(R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.v$k */
    static final class k extends Lambda implements Function1<LayoutNode, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f52488f = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(LayoutNode layoutNode) {
            SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
            boolean z10 = false;
            if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.platform.v$l */
    static final class l extends Lambda implements Function1<LayoutNode, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final l f52489f = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(LayoutNode layoutNode) {
            return Boolean.valueOf(layoutNode.getNodes().p(C5952f0.a(8)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(C6039v c6039v) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.b(c6039v.view, false, 1, null);
            Unit unit = Unit.f143329a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                c6039v.R();
                Trace.endSection();
                c6039v.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B0(int id2) {
        if (id2 == this.view.getSemanticsOwner().d().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
            return -1;
        }
        return id2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void C0(r1.C16820n r17, androidx.compose.ui.platform.C6053z1 r18) {
        /*
            r16 = this;
            r0 = r16
            Z.L r1 = Z.C5621t.b()
            java.util.List r2 = r17.t()
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
            r5 = r4
        L13:
            if (r5 >= r3) goto L49
            java.lang.Object r6 = r2.get(r5)
            r1.n r6 = (r1.C16820n) r6
            Z.q r7 = r0.a0()
            int r8 = r6.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L46
            Z.L r7 = r18.getChildren()
            int r8 = r6.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L3f
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            r0.o0(r1)
            return
        L3f:
            int r6 = r6.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            r1.g(r6)
        L46:
            int r5 = r5 + 1
            goto L13
        L49:
            Z.L r2 = r18.getChildren()
            int[] r3 = r2.elements
            long[] r2 = r2.metadata
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9a
            r6 = r4
        L57:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L95
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r4
        L71:
            if (r11 >= r9) goto L93
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8f
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            boolean r12 = r1.a(r12)
            if (r12 != 0) goto L8f
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            r0.o0(r1)
            return
        L8f:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L71
        L93:
            if (r9 != r10) goto L9a
        L95:
            if (r6 == r5) goto L9a
            int r6 = r6 + 1
            goto L57
        L9a:
            java.util.List r1 = r17.t()
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        La5:
            if (r4 >= r2) goto Ld0
            java.lang.Object r3 = r1.get(r4)
            r1.n r3 = (r1.C16820n) r3
            Z.q r5 = r0.a0()
            int r6 = r3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lcd
            Z.K<androidx.compose.ui.platform.z1> r5 = r0.previousSemanticsNodes
            int r6 = r3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            java.lang.Object r5 = r5.b(r6)
            kotlin.jvm.internal.Intrinsics.g(r5)
            androidx.compose.ui.platform.z1 r5 = (androidx.compose.ui.platform.C6053z1) r5
            r0.C0(r3, r5)
        Lcd:
            int r4 = r4 + 1
            goto La5
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C6039v.C0(r1.n, androidx.compose.ui.platform.z1):void");
    }

    private final boolean E0(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !m0()) {
            return false;
        }
        AccessibilityEvent accessibilityEventT = T(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventT.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventT.setContentDescription(J1.a.e(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        return D0(accessibilityEventT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean F0(C6039v c6039v, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return c6039v.E0(i10, i11, num, list);
    }

    private final void H0(int semanticsNodeId) {
        f fVar = this.pendingTextTraversedEvent;
        if (fVar != null) {
            if (semanticsNodeId != fVar.getNode().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventT = T(B0(fVar.getNode().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()), 131072);
                accessibilityEventT.setFromIndex(fVar.getFromIndex());
                accessibilityEventT.setToIndex(fVar.getToIndex());
                accessibilityEventT.setAction(fVar.getAction());
                accessibilityEventT.setMovementGranularity(fVar.getGranularity());
                accessibilityEventT.getText().add(f0(fVar.getNode()));
                D0(accessibilityEventT);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x055b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I0(Z.AbstractC5619q<androidx.compose.ui.platform.A1> r54) {
        /*
            Method dump skipped, instructions count: 1701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C6039v.I0(Z.q):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean Q(Z.AbstractC5619q<androidx.compose.ui.platform.A1> r21, boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C6039v.Q(Z.q, boolean, int, long):boolean");
    }

    private final SpannableString Q0(AnnotatedString annotatedString) {
        return (SpannableString) T0(C1.a.b(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), 100000);
    }

    private final void R() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m0()) {
                C0(this.view.getSemanticsOwner().d(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.f143329a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                I0(a0());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    V0();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(C6039v c6039v, boolean z10) {
        c6039v.enabledServices = c6039v.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final <T extends CharSequence> T T0(T text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i10 = size - 1;
        if (Character.isHighSurrogate(text.charAt(i10)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i10;
        }
        T t10 = (T) text.subSequence(0, size);
        Intrinsics.h(t10, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final q2.y U(int virtualViewId) {
        InterfaceC6172s lifecycleOwner;
        AbstractC6165l lifecycle;
        AndroidComposeView.C5973b viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == AbstractC6165l.b.f55499a) {
            return null;
        }
        q2.y yVarB0 = q2.y.b0();
        A1 a1B = a0().b(virtualViewId);
        if (a1B == null) {
            return null;
        }
        C16820n semanticsNode = a1B.getSemanticsNode();
        if (virtualViewId == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            yVarB0.L0(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            C16820n c16820nR = semanticsNode.r();
            Integer numValueOf = c16820nR != null ? Integer.valueOf(c16820nR.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) : null;
            if (numValueOf == null) {
                C14920a.c("semanticsNode " + virtualViewId + " has null parent");
                throw new KotlinNothingValueException();
            }
            int iIntValue = numValueOf.intValue();
            yVarB0.M0(this.view, iIntValue != this.view.getSemanticsOwner().d().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() ? iIntValue : -1);
        }
        yVarB0.V0(this.view, virtualViewId);
        yVarB0.m0(N(a1B));
        u0(virtualViewId, yVarB0, semanticsNode);
        return yVarB0;
    }

    private final void U0(int virtualViewId) {
        int i10 = this.hoveredVirtualViewId;
        if (i10 == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        F0(this, virtualViewId, 128, null, null, 12, null);
        F0(this, i10, 256, null, null, 12, null);
    }

    private final AccessibilityEvent V(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventT = T(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventT.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventT.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventT.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventT.getText().add(text);
        }
        return accessibilityEventT;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void V0() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C6039v.V0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(C6039v c6039v, boolean z10) {
        c6039v.enabledServices = z10 ? c6039v.accessibilityManager.getEnabledAccessibilityServiceList(-1) : CollectionsKt.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5619q<A1> a0() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = B1.b(this.view.getSemanticsOwner());
            if (m0()) {
                C6045x.z(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    private final AnnotatedString h0(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean k0(int virtualViewId) {
        return this.accessibilityFocusedVirtualViewId == virtualViewId;
    }

    private final boolean n0() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.k(Unit.f143329a);
        }
    }

    public final void N0(long j10) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (mv.Z.b(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:35:0x0091, B:36:0x00a2, B:38:0x00a9, B:39:0x00b2, B:20:0x0051), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cf -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C6039v.O(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.core.view.a
    public q2.z b(View host) {
        return this.nodeProvider;
    }

    /* renamed from: b0, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* renamed from: c0, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: d0, reason: from getter */
    public final Z.I getIdToAfterMap() {
        return this.idToAfterMap;
    }

    /* renamed from: e0, reason: from getter */
    public final Z.I getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    /* renamed from: i0, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final int j0(float x10, float y10) {
        int iB0;
        Owner.b(this.view, false, 1, null);
        C5968w c5968w = new C5968w();
        LayoutNode.x0(this.view.getRoot(), U0.f.e((Float.floatToRawIntBits(y10) & 4294967295L) | (Float.floatToRawIntBits(x10) << 32)), c5968w, 0, false, 12, null);
        int iO = CollectionsKt.o(c5968w);
        while (true) {
            iB0 = Integer.MIN_VALUE;
            if (-1 >= iO) {
                break;
            }
            LayoutNode layoutNodeO = C5957k.o(c5968w.get(iO));
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeO) != null) {
                return Integer.MIN_VALUE;
            }
            if (layoutNodeO.getNodes().p(C5952f0.a(8))) {
                iB0 = B0(layoutNodeO.getSemanticsId());
                C16820n c16820nA = C16821o.a(layoutNodeO, false);
                if (B1.g(c16820nA) && !c16820nA.n().contains(SemanticsProperties.INSTANCE.s())) {
                    break;
                }
            }
            iO--;
        }
        return iB0;
    }

    public final boolean m0() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty();
    }

    public C6039v(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.s
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                C6039v.X(this.f52365a, z10);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.t
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                C6039v.R0(this.f52369a, z10);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new e();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new Z.K<>(0, 1, null);
        this.pendingVerticalScrollEvents = new Z.K<>(0, 1, null);
        this.actionIdToLabel = new Z.o0<>(0, 1, null);
        this.labelToActionId = new Z.o0<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new C5604b<>(0, 1, null);
        this.boundsUpdateChannel = ov.j.b(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = Z.r.b();
        this.paneDisplayed = new Z.L(0, 1, null);
        this.idToBeforeMap = new Z.I(0, 1, null);
        this.idToAfterMap = new Z.I(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new C1.v();
        this.previousSemanticsNodes = Z.r.c();
        this.previousSemanticsRoot = new C6053z1(androidComposeView.getSemanticsOwner().d(), Z.r.b());
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.u
            @Override // java.lang.Runnable
            public final void run() {
                C6039v.A0(this.f52423a);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new j();
    }

    private final boolean D0(AccessibilityEvent event) {
        if (!m0()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final void G0(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventT = T(B0(semanticsNodeId), 32);
        accessibilityEventT.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventT.getText().add(title);
        }
        D0(accessibilityEventT);
    }

    private final void J0(LayoutNode layoutNode, Z.L subtreeChangedSemanticsNodesIds) {
        SemanticsConfiguration semanticsConfiguration;
        LayoutNode layoutNodeQ;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().p(C5952f0.a(8))) {
                layoutNode = C6045x.q(layoutNode, l.f52489f);
            }
            if (layoutNode != null && (semanticsConfiguration = layoutNode.getSemanticsConfiguration()) != null) {
                if (!semanticsConfiguration.getIsMergingSemanticsOfDescendants() && (layoutNodeQ = C6045x.q(layoutNode, k.f52488f)) != null) {
                    layoutNode = layoutNodeQ;
                }
                int semanticsId = layoutNode.getSemanticsId();
                if (subtreeChangedSemanticsNodesIds.g(semanticsId)) {
                    F0(this, B0(semanticsId), RecyclerView.m.FLAG_MOVED, 1, null, 8, null);
                }
            }
        }
    }

    private final void K0(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRangeB = this.pendingHorizontalScrollEvents.b(semanticsId);
            ScrollAxisRange scrollAxisRangeB2 = this.pendingVerticalScrollEvents.b(semanticsId);
            if (scrollAxisRangeB == null && scrollAxisRangeB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventT = T(semanticsId, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (scrollAxisRangeB != null) {
                accessibilityEventT.setScrollX((int) scrollAxisRangeB.c().invoke().floatValue());
                accessibilityEventT.setMaxScrollX((int) scrollAxisRangeB.a().invoke().floatValue());
            }
            if (scrollAxisRangeB2 != null) {
                accessibilityEventT.setScrollY((int) scrollAxisRangeB2.c().invoke().floatValue());
                accessibilityEventT.setMaxScrollY((int) scrollAxisRangeB2.a().invoke().floatValue());
            }
            D0(accessibilityEventT);
        }
    }

    private final boolean L0(C16820n node, int start, int end, boolean traversalMode) {
        String strF0;
        Integer numValueOf;
        Integer numValueOf2;
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        boolean z10 = false;
        if (unmergedConfig.contains(semanticsActions.y()) && C6045x.o(node)) {
            Function3 function3 = (Function3) ((AccessibilityAction) node.getUnmergedConfig().n(semanticsActions.y())).a();
            if (function3 == null) {
                return false;
            }
            return ((Boolean) function3.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (strF0 = f0(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > strF0.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        if (strF0.length() > 0) {
            z10 = true;
        }
        int iB0 = B0(node.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        Integer numValueOf3 = null;
        if (z10) {
            numValueOf = Integer.valueOf(this.accessibilityCursorPosition);
        } else {
            numValueOf = null;
        }
        if (z10) {
            numValueOf2 = Integer.valueOf(this.accessibilityCursorPosition);
        } else {
            numValueOf2 = null;
        }
        if (z10) {
            numValueOf3 = Integer.valueOf(strF0.length());
        }
        D0(V(iB0, numValueOf, numValueOf2, numValueOf3, strF0));
        H0(node.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int virtualViewId, q2.y info, String extraDataKey, Bundle arguments) {
        C16820n semanticsNode;
        int length;
        A1 a1B = a0().b(virtualViewId);
        if (a1B != null && (semanticsNode = a1B.getSemanticsNode()) != null) {
            String strF0 = f0(semanticsNode);
            if (Intrinsics.e(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
                int iE = this.idToBeforeMap.e(virtualViewId, -1);
                if (iE != -1) {
                    info.v().putInt(extraDataKey, iE);
                    return;
                }
                return;
            }
            if (Intrinsics.e(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
                int iE2 = this.idToAfterMap.e(virtualViewId, -1);
                if (iE2 != -1) {
                    info.v().putInt(extraDataKey, iE2);
                    return;
                }
                return;
            }
            if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.i()) && arguments != null && Intrinsics.e(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i10 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i11 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i11 > 0 && i10 >= 0) {
                    if (strF0 != null) {
                        length = strF0.length();
                    } else {
                        length = a.e.API_PRIORITY_OTHER;
                    }
                    if (i10 < length) {
                        TextLayoutResult textLayoutResultE = B1.e(semanticsNode.getUnmergedConfig());
                        if (textLayoutResultE != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i12 = 0; i12 < i11; i12++) {
                                int i13 = i10 + i12;
                                if (i13 >= textLayoutResultE.getLayoutInput().getText().length()) {
                                    arrayList.add(null);
                                } else {
                                    arrayList.add(P0(semanticsNode, textLayoutResultE.d(i13)));
                                }
                            }
                            info.v().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                FS.log_e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                return;
            }
            SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (unmergedConfig.contains(semanticsProperties.getTestTag()) && arguments != null && Intrinsics.e(extraDataKey, "androidx.compose.ui.semantics.testTag")) {
                String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getTestTag());
                if (str != null) {
                    info.v().putCharSequence(extraDataKey, str);
                    return;
                }
                return;
            }
            if (Intrinsics.e(extraDataKey, "androidx.compose.ui.semantics.id")) {
                info.v().putInt(extraDataKey, semanticsNode.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
            }
        }
    }

    private final void M0(C16820n node, q2.y info) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig.contains(semanticsProperties.e())) {
            info.u0(true);
            info.y0((CharSequence) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.e()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect N(A1 node) {
        android.graphics.Rect adjustedBounds = node.getAdjustedBounds();
        AndroidComposeView androidComposeView = this.view;
        float f10 = adjustedBounds.left;
        float f11 = adjustedBounds.top;
        long jS = androidComposeView.s(U0.f.e((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
        AndroidComposeView androidComposeView2 = this.view;
        float f12 = adjustedBounds.right;
        float f13 = adjustedBounds.bottom;
        long jS2 = androidComposeView2.s(U0.f.e((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L)));
        return new android.graphics.Rect((int) Math.floor(Float.intBitsToFloat((int) (jS >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jS & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jS2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jS2 & 4294967295L))));
    }

    private final void O0(C16820n node, q2.y info) {
        SpannableString spannableStringQ0;
        AnnotatedString annotatedStringU = C6045x.u(node);
        if (annotatedStringU != null) {
            spannableStringQ0 = Q0(annotatedStringU);
        } else {
            spannableStringQ0 = null;
        }
        info.X0(spannableStringQ0);
    }

    private final boolean S(int virtualViewId) {
        if (k0(virtualViewId)) {
            this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.currentlyAccessibilityFocusedANI = null;
            this.view.invalidate();
            F0(this, virtualViewId, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    private final boolean S0(C16820n node, int granularity, boolean forward, boolean extendSelection) {
        int[] iArrB;
        int iZ;
        int i10;
        int i11;
        int i12 = node.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        Integer num = this.previousTraversedNode;
        if (num == null || i12 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        }
        String strF0 = f0(node);
        boolean z10 = false;
        if (strF0 != null && strF0.length() != 0) {
            InterfaceC5992f interfaceC5992fG0 = g0(node, granularity);
            if (interfaceC5992fG0 == null) {
                return false;
            }
            int iY = Y(node);
            if (iY == -1) {
                if (forward) {
                    iY = 0;
                } else {
                    iY = strF0.length();
                }
            }
            if (forward) {
                iArrB = interfaceC5992fG0.a(iY);
            } else {
                iArrB = interfaceC5992fG0.b(iY);
            }
            if (iArrB == null) {
                return false;
            }
            int i13 = iArrB[0];
            z10 = true;
            int i14 = iArrB[1];
            if (extendSelection && l0(node)) {
                iZ = Z(node);
                if (iZ == -1) {
                    if (forward) {
                        iZ = i13;
                    } else {
                        iZ = i14;
                    }
                }
                if (forward) {
                    i10 = i14;
                } else {
                    i10 = i13;
                }
            } else {
                if (forward) {
                    iZ = i14;
                } else {
                    iZ = i13;
                }
                i10 = iZ;
            }
            if (forward) {
                i11 = 256;
            } else {
                i11 = 512;
            }
            this.pendingTextTraversedEvent = new f(node, i11, granularity, i13, i14, SystemClock.uptimeMillis());
            L0(node, iZ, i10, true);
        }
        return z10;
    }

    private final AccessibilityEvent T(int virtualViewId, int eventType) {
        A1 a1B;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, virtualViewId);
        if (m0() && (a1B = a0().b(virtualViewId)) != null) {
            accessibilityEventObtain.setPassword(a1B.getSemanticsNode().getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        }
        return accessibilityEventObtain;
    }

    private final int Y(C16820n node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.A())) {
            return androidx.compose.ui.text.y.i(((androidx.compose.ui.text.y) node.getUnmergedConfig().n(semanticsProperties.A())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final int Z(C16820n node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.A())) {
            return androidx.compose.ui.text.y.n(((androidx.compose.ui.text.y) node.getUnmergedConfig().n(semanticsProperties.A())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final boolean l0(C16820n node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.getEditableText())) {
            return true;
        }
        return false;
    }

    private static final float t0(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            if (Math.abs(f10) < Math.abs(f11)) {
                return f10;
            }
            return f11;
        }
        return 0.0f;
    }

    private static final boolean v0(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.c().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            if (scrollAxisRange.c().invoke().floatValue() < scrollAxisRange.a().invoke().floatValue() && scrollAxisRange.getReverseScrolling()) {
                return true;
            }
            return false;
        }
        return true;
    }

    private static final boolean w0(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.c().invoke().floatValue() >= scrollAxisRange.a().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            if (scrollAxisRange.c().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling()) {
                return true;
            }
            return false;
        }
        return true;
    }

    private final boolean x0(int id2, List<C6050y1> oldScrollObservationScopes) {
        boolean z10;
        C6050y1 c6050y1A = B1.a(oldScrollObservationScopes, id2);
        if (c6050y1A != null) {
            z10 = false;
        } else {
            C6050y1 c6050y1 = new C6050y1(id2, this.scrollObservationScopes, null, null, null, null);
            z10 = true;
            c6050y1A = c6050y1;
        }
        this.scrollObservationScopes.add(c6050y1A);
        return z10;
    }

    private final boolean y0(int virtualViewId) {
        if (!n0() || k0(virtualViewId)) {
            return false;
        }
        int i10 = this.accessibilityFocusedVirtualViewId;
        if (i10 != Integer.MIN_VALUE) {
            F0(this, i10, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        F0(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(C6050y1 scrollObservationScope) {
        if (!scrollObservationScope.e1()) {
            return;
        }
        this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new i(scrollObservationScope, this));
    }

    public final boolean P(boolean vertical, int direction, long position) {
        if (!Intrinsics.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        return Q(a0(), vertical, direction, position);
    }

    public final boolean W(MotionEvent event) {
        if (!n0()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
                U0(Integer.MIN_VALUE);
                return true;
            }
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        int iJ0 = j0(event.getX(), event.getY());
        boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        U0(iJ0);
        if (iJ0 != Integer.MIN_VALUE) {
            return true;
        }
        return zDispatchGenericMotionEvent;
    }
}
