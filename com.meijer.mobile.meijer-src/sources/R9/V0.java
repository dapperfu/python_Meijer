package R9;

import Da.SessionIdHolder;
import J9.a;
import Ld.C4022l;
import Ld.InterfaceC4013c;
import Ld.InterfaceC4017g;
import Ma.PredictRequestContext;
import Q8.EmarsysConfig;
import W9.MobileEngageRequestContext;
import a9.C5670b;
import a9.C5673e;
import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import b9.C6341a;
import c9.C6493a;
import ca.C6495b;
import ca.C6496c;
import ca.InterfaceC6494a;
import com.emarsys.NotificationOpenedActivity;
import com.fullstory.FS;
import d9.C13643a;
import d9.C13644b;
import d9.C13645c;
import da.C13646a;
import da.InterfaceC13647b;
import e9.InterfaceC13782a;
import f9.C13971b;
import ha.C14490a;
import ha.C14491b;
import ha.C14493d;
import ha.InterfaceC14492c;
import id.C14724g;
import j9.C14969b;
import j9.DeviceInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l9.C15476b;
import o9.C16088a;
import org.json.JSONException;
import org.json.JSONObject;
import p9.C16412a;
import pa.ButtonClicked;
import qa.C16616a;
import qa.C16617b;
import r9.C16874a;
import r9.C16876c;
import ra.C16877a;
import s9.C17033a;
import t9.C17209a;
import ta.C17213d;
import u9.C17361a;
import ua.C17362a;
import ua.C17363b;
import ua.C17364c;
import v9.C17649a;
import va.C17650a;
import w9.C17852a;
import xa.C18140d;
import xa.C18141e;
import xa.C18142f;
import xa.C18143g;
import xa.C18146j;
import xa.InterfaceC18144h;
import xa.InterfaceC18145i;
import z9.C18463b;
import za.C18465b;

@Metadata(d1 = {"\u0000º\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u008b\u00042\u00020\u0001:\u0002\u0096\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001a\u0010#\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010/\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00104\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103R\u001a\u00107\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u001a\u0010=\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010@\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R\u001a\u0010F\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u001a\u0010O\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010R\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bQ\u0010NR\u001a\u0010X\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010[\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010WR\u001a\u0010\u0003\u001a\u00020\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010e\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010h\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\bg\u0010dR\u001a\u0010n\u001a\u00020i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010q\u001a\u00020i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010k\u001a\u0004\bp\u0010mR\u001a\u0010u\u001a\u00020r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010s\u001a\u0004\bK\u0010tR\u001a\u0010x\u001a\u00020r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010s\u001a\u0004\bw\u0010tR\u001a\u0010~\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001b\u0010\u0080\u0001\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u007f\u0010{\u001a\u0004\b>\u0010}R \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0089\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0083\u0001\u001a\u0006\b\u0088\u0001\u0010\u0085\u0001R!\u0010\u008f\u0001\u001a\u00030\u008a\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0094\u0001\u001a\u00030\u0090\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u008c\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0098\u0001\u001a\u00030\u0095\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bw\u0010\u008c\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u009c\u0001\u001a\u00030\u0099\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b'\u0010\u008c\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010 \u0001\u001a\u00030\u009d\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u008c\u0001\u001a\u0005\bo\u0010\u009f\u0001R!\u0010¤\u0001\u001a\u00030¡\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u008c\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R!\u0010©\u0001\u001a\u00030¥\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u008c\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\"\u0010®\u0001\u001a\r «\u0001*\u0005\u0018\u00010ª\u00010ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R!\u0010±\u0001\u001a\u00030ª\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u008c\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R!\u0010´\u0001\u001a\u00030ª\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0001\u0010\u008c\u0001\u001a\u0006\b³\u0001\u0010°\u0001R)\u0010¸\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bM\u0010\u008c\u0001\u001a\u0006\b\u0082\u0001\u0010·\u0001R)\u0010º\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b¹\u0001\u0010\u008c\u0001\u001a\u0005\bz\u0010·\u0001R*\u0010½\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b»\u0001\u0010\u008c\u0001\u001a\u0006\b¼\u0001\u0010·\u0001R)\u0010¿\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b¾\u0001\u0010\u008c\u0001\u001a\u0005\b\u007f\u0010·\u0001R!\u0010Ã\u0001\u001a\u00030À\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u008c\u0001\u001a\u0006\b\u008b\u0001\u0010Â\u0001R*\u0010Æ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÄ\u0001\u0010\u008c\u0001\u001a\u0006\bÅ\u0001\u0010·\u0001R\u001f\u0010\u0007\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0001\u0010\u008c\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R \u0010Í\u0001\u001a\u00030Ê\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bl\u0010\u008c\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R!\u0010Ò\u0001\u001a\u00030Î\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0001\u0010\u008c\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R!\u0010Ö\u0001\u001a\u00030Ó\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010\u008c\u0001\u001a\u0006\b\u0087\u0001\u0010Õ\u0001R!\u0010Ú\u0001\u001a\u00030×\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bØ\u0001\u0010\u008c\u0001\u001a\u0006\bÄ\u0001\u0010Ù\u0001R)\u0010Ü\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u001c\u0010\u008c\u0001\u001a\u0006\bÛ\u0001\u0010·\u0001R*\u0010ß\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÝ\u0001\u0010\u008c\u0001\u001a\u0006\bÞ\u0001\u0010·\u0001R!\u0010ä\u0001\u001a\u00030à\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bá\u0001\u0010\u008c\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R \u0010è\u0001\u001a\u00030å\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bæ\u0001\u0010\u008c\u0001\u001a\u0005\bf\u0010ç\u0001R \u0010ì\u0001\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bé\u0001\u0010\u008c\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R-\u0010ñ\u0001\u001a\u000f\u0012\u0005\u0012\u00030í\u0001\u0012\u0004\u0012\u00020\f0\n8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bî\u0001\u0010\u008c\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R-\u0010õ\u0001\u001a\u000f\u0012\u0005\u0012\u00030ò\u0001\u0012\u0004\u0012\u00020\f0\n8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bó\u0001\u0010\u008c\u0001\u001a\u0006\bô\u0001\u0010ð\u0001R-\u0010ù\u0001\u001a\u000f\u0012\u0005\u0012\u00030ö\u0001\u0012\u0004\u0012\u00020\f0\n8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b÷\u0001\u0010\u008c\u0001\u001a\u0006\bø\u0001\u0010ð\u0001R,\u0010ü\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bú\u0001\u0010\u008c\u0001\u001a\u0006\bû\u0001\u0010ð\u0001R!\u0010\u0081\u0002\u001a\u00030ý\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bþ\u0001\u0010\u008c\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R!\u0010\u0086\u0002\u001a\u00030\u0082\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010\u008c\u0001\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R*\u0010\u0089\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0002\u0010\u008c\u0001\u001a\u0006\b\u0088\u0002\u0010·\u0001R*\u0010\u008c\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0002\u0010\u008c\u0001\u001a\u0006\b\u008b\u0002\u0010·\u0001R*\u0010\u008f\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0002\u0010\u008c\u0001\u001a\u0006\b\u008e\u0002\u0010·\u0001R*\u0010\u0092\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010\u008c\u0001\u001a\u0006\b\u0091\u0002\u0010·\u0001R*\u0010\u0095\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0002\u0010\u008c\u0001\u001a\u0006\b\u0094\u0002\u0010·\u0001R)\u0010\u0098\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0096\u0002\u0010\u008c\u0001\u001a\u0006\b\u0097\u0002\u0010·\u0001R!\u0010\u009d\u0002\u001a\u00030\u0099\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0002\u0010\u008c\u0001\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R!\u0010 \u0002\u001a\u00030\u0099\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0002\u0010\u008c\u0001\u001a\u0006\b\u009f\u0002\u0010\u009c\u0002R!\u0010£\u0002\u001a\u00030\u0099\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0002\u0010\u008c\u0001\u001a\u0006\b¢\u0002\u0010\u009c\u0002R!\u0010¦\u0002\u001a\u00030\u0099\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0002\u0010\u008c\u0001\u001a\u0006\b¥\u0002\u0010\u009c\u0002R!\u0010«\u0002\u001a\u00030§\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0002\u0010\u008c\u0001\u001a\u0006\b©\u0002\u0010ª\u0002R!\u0010°\u0002\u001a\u00030¬\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0002\u0010\u008c\u0001\u001a\u0006\b®\u0002\u0010¯\u0002R!\u0010µ\u0002\u001a\u00030±\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0002\u0010\u008c\u0001\u001a\u0006\b³\u0002\u0010´\u0002R!\u0010º\u0002\u001a\u00030¶\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b·\u0002\u0010\u008c\u0001\u001a\u0006\b¸\u0002\u0010¹\u0002R!\u0010¿\u0002\u001a\u00030»\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0002\u0010\u008c\u0001\u001a\u0006\b½\u0002\u0010¾\u0002R \u0010Ã\u0002\u001a\u00030À\u00028VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bÁ\u0002\u0010\u008c\u0001\u001a\u0005\bv\u0010Â\u0002R \u0010Ç\u0002\u001a\u00030Ä\u00028VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bÅ\u0002\u0010\u008c\u0001\u001a\u0005\b%\u0010Æ\u0002R!\u0010Ê\u0002\u001a\u00030Ä\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÈ\u0002\u0010\u008c\u0001\u001a\u0006\bÉ\u0002\u0010Æ\u0002R!\u0010Ï\u0002\u001a\u00030Ë\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÌ\u0002\u0010\u008c\u0001\u001a\u0006\bÍ\u0002\u0010Î\u0002R!\u0010Ô\u0002\u001a\u00030Ð\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÑ\u0002\u0010\u008c\u0001\u001a\u0006\bÒ\u0002\u0010Ó\u0002R!\u0010×\u0002\u001a\u00030Ð\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÕ\u0002\u0010\u008c\u0001\u001a\u0006\bÖ\u0002\u0010Ó\u0002R \u0010Û\u0002\u001a\u00030Ø\u00028VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bÙ\u0002\u0010\u008c\u0001\u001a\u0005\bY\u0010Ú\u0002R \u0010ß\u0002\u001a\u00030Ü\u00028VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bÝ\u0002\u0010\u008c\u0001\u001a\u0005\bT\u0010Þ\u0002R!\u0010á\u0002\u001a\u00030À\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bà\u0002\u0010\u008c\u0001\u001a\u0006\b\u0091\u0001\u0010Â\u0002R!\u0010å\u0002\u001a\u00030â\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bã\u0002\u0010\u008c\u0001\u001a\u0006\bÁ\u0001\u0010ä\u0002R \u0010ç\u0002\u001a\u00030â\u00028VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bæ\u0002\u0010\u008c\u0001\u001a\u0005\bj\u0010ä\u0002R!\u0010ì\u0002\u001a\u00030è\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bé\u0002\u0010\u008c\u0001\u001a\u0006\bê\u0002\u0010ë\u0002R!\u0010ï\u0002\u001a\u00030è\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bí\u0002\u0010\u008c\u0001\u001a\u0006\bî\u0002\u0010ë\u0002R!\u0010ô\u0002\u001a\u00030ð\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bñ\u0002\u0010\u008c\u0001\u001a\u0006\bò\u0002\u0010ó\u0002R!\u0010÷\u0002\u001a\u00030ð\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bõ\u0002\u0010\u008c\u0001\u001a\u0006\bö\u0002\u0010ó\u0002R!\u0010ü\u0002\u001a\u00030ø\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bù\u0002\u0010\u008c\u0001\u001a\u0006\bú\u0002\u0010û\u0002R!\u0010\u0080\u0003\u001a\u00030ý\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bþ\u0002\u0010\u008c\u0001\u001a\u0006\b¹\u0001\u0010ÿ\u0002R \u0010\u0082\u0003\u001a\u00030ý\u00028VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b\u0081\u0003\u0010\u008c\u0001\u001a\u0005\b\u001e\u0010ÿ\u0002R \u0010\u0086\u0003\u001a\u00030\u0083\u00038VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b\u0084\u0003\u0010\u008c\u0001\u001a\u0005\bB\u0010\u0085\u0003R!\u0010\u008a\u0003\u001a\u00030\u0087\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0003\u0010\u008c\u0001\u001a\u0006\bÏ\u0001\u0010\u0089\u0003R!\u0010\u008f\u0003\u001a\u00030\u008b\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0003\u0010\u008c\u0001\u001a\u0006\b\u008d\u0003\u0010\u008e\u0003R!\u0010\u0094\u0003\u001a\u00030\u0090\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0003\u0010\u008c\u0001\u001a\u0006\b\u0092\u0003\u0010\u0093\u0003R+\u0010\u009b\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u00160\u0095\u0003j\u0003`\u0096\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0003\u0010\u0098\u0003\u001a\u0006\b\u0099\u0003\u0010\u009a\u0003R_\u0010§\u0003\u001aB\u0012\u0019\u0012\u0017\u0018\u00010¶\u0001¢\u0006\u000f\b\u009d\u0003\u0012\n\b\u009e\u0003\u0012\u0005\b\b(\u009f\u0003\u0012\u0017\u0012\u00150 \u0003¢\u0006\u000f\b\u009d\u0003\u0012\n\b\u009e\u0003\u0012\u0005\b\b(¡\u0003\u0012\u0004\u0012\u00020\u00160\u009c\u0003j\u0003`¢\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0003\u0010¤\u0003\u001a\u0006\b¥\u0003\u0010¦\u0003R)\u0010©\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b¨\u0003\u0010\u008c\u0001\u001a\u0005\ba\u0010·\u0001R*\u0010¬\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0003\u0010\u008c\u0001\u001a\u0006\b«\u0003\u0010·\u0001R!\u0010±\u0003\u001a\u00030\u00ad\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0003\u0010\u008c\u0001\u001a\u0006\b¯\u0003\u0010°\u0003R!\u0010´\u0003\u001a\u00030Ð\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0003\u0010\u008c\u0001\u001a\u0006\b³\u0003\u0010Ó\u0002R!\u0010¸\u0003\u001a\u00030µ\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¶\u0003\u0010\u008c\u0001\u001a\u0006\b¦\u0001\u0010·\u0003R \u0010º\u0003\u001a\u00030µ\u00038VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b¹\u0003\u0010\u008c\u0001\u001a\u0005\bP\u0010·\u0003R!\u0010½\u0003\u001a\u00030Ð\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b»\u0003\u0010\u008c\u0001\u001a\u0006\b¼\u0003\u0010Ó\u0002R!\u0010Â\u0003\u001a\u00030¾\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0003\u0010\u008c\u0001\u001a\u0006\bÀ\u0003\u0010Á\u0003R!\u0010Æ\u0003\u001a\u00030Ã\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÄ\u0003\u0010\u008c\u0001\u001a\u0006\b¾\u0001\u0010Å\u0003R!\u0010É\u0003\u001a\u00030Ã\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0003\u0010\u008c\u0001\u001a\u0006\bÈ\u0003\u0010Å\u0003R!\u0010Î\u0003\u001a\u00030Ê\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bË\u0003\u0010\u008c\u0001\u001a\u0006\bÌ\u0003\u0010Í\u0003R \u0010Ò\u0003\u001a\u00030Ï\u00038VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bÐ\u0003\u0010\u008c\u0001\u001a\u0005\b5\u0010Ñ\u0003R!\u0010Ö\u0003\u001a\u00030Ó\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0003\u0010\u008c\u0001\u001a\u0006\b\u009e\u0001\u0010Õ\u0003R \u0010Ú\u0003\u001a\u00030×\u00038VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bØ\u0003\u0010\u008c\u0001\u001a\u0005\b9\u0010Ù\u0003R!\u0010ß\u0003\u001a\u00030Û\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÜ\u0003\u0010\u008c\u0001\u001a\u0006\bÝ\u0003\u0010Þ\u0003R!\u0010ä\u0003\u001a\u00030à\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bá\u0003\u0010\u008c\u0001\u001a\u0006\bâ\u0003\u0010ã\u0003R!\u0010è\u0003\u001a\u00030å\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bæ\u0003\u0010\u008c\u0001\u001a\u0006\b¬\u0001\u0010ç\u0003R!\u0010ì\u0003\u001a\u00030é\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bê\u0003\u0010\u008c\u0001\u001a\u0006\bÇ\u0001\u0010ë\u0003R!\u0010ð\u0003\u001a\u00030í\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bî\u0003\u0010\u008c\u0001\u001a\u0006\b»\u0001\u0010ï\u0003R \u0010ô\u0003\u001a\u00030ñ\u00038VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bò\u0003\u0010\u008c\u0001\u001a\u0005\b \u0010ó\u0003R!\u0010ù\u0003\u001a\u00030õ\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bö\u0003\u0010\u008c\u0001\u001a\u0006\b÷\u0003\u0010ø\u0003R \u0010ý\u0003\u001a\u00030ú\u00038VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bû\u0003\u0010\u008c\u0001\u001a\u0005\b\u001b\u0010ü\u0003R!\u0010ÿ\u0003\u001a\u00030ú\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bþ\u0003\u0010\u008c\u0001\u001a\u0006\b²\u0001\u0010ü\u0003R \u0010\u0081\u0004\u001a\u00030í\u00038VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b\u0080\u0004\u0010\u008c\u0001\u001a\u0005\bG\u0010ï\u0003R!\u0010\u0084\u0004\u001a\u00030\u0099\u00028VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0082\u0004\u0010\u008c\u0001\u001a\u0006\b\u0083\u0004\u0010\u009c\u0002R*\u0010\u0087\u0004\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0004\u0010\u008c\u0001\u001a\u0006\b\u0086\u0004\u0010·\u0001R\u001b\u0010\u008a\u0004\u001a\u0007\u0012\u0002\b\u00030\u0088\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b+\u0010\u0089\u0004¨\u0006\u008c\u0004"}, d2 = {"LR9/V0;", "LR9/Y0;", "LQ8/h;", "config", "<init>", "(LQ8/h;)V", "Lf9/b;", "coreDbHelper", "Lka/e;", "inAppEventHandler", "Lg9/c;", "LA9/c;", "Lg9/d;", "n2", "(Lf9/b;Lka/e;)Lg9/c;", "Ljava/security/PublicKey;", "l2", "()Ljava/security/PublicKey;", "", "LS8/c;", "m2", "()Ljava/util/List;", "", "K3", "emarsysConfig", "j", "", "e", "Z", "isHuaweiServiceAvailable", "f", "isGoogleAvailable", "g", "L3", "()Z", "isGooglePlayServiceAvailable", "Ln9/b;", "h", "Ln9/b;", "H", "()Ln9/b;", "concurrentHandlerHolder", "LQ9/b;", "i", "LQ9/b;", "getDeepLink", "()LQ9/b;", "deepLink", "LV9/b;", "LV9/b;", "getMessageInbox", "()LV9/b;", "messageInbox", "k", "getLoggingMessageInbox", "loggingMessageInbox", "LU9/b;", "l", "LU9/b;", "getInApp", "()LU9/b;", "inApp", "m", "getLoggingInApp", "loggingInApp", "LGa/b;", "n", "LGa/b;", "getOnEventAction", "()LGa/b;", "onEventAction", "o", "getLoggingOnEventAction", "loggingOnEventAction", "LQa/b;", "p", "LQa/b;", "O", "()LQa/b;", "push", "q", "t", "loggingPush", "LHa/d;", "r", "LHa/d;", "getPredict", "()LHa/d;", "predict", "s", "getLoggingPredict", "loggingPredict", "LQ8/b;", "LQ8/b;", "b", "()LQ8/b;", "LT9/b;", "u", "LT9/b;", "getGeofence", "()LT9/b;", "geofence", "v", "getLoggingGeofence", "loggingGeofence", "LW9/i;", "w", "LW9/i;", "V", "()LW9/i;", "mobileEngage", "x", "y", "loggingMobileEngage", "LHa/h;", "LHa/h;", "()LHa/h;", "predictRestricted", "z", "G", "loggingPredictRestricted", "LO8/b;", "A", "LO8/b;", "c", "()LO8/b;", "clientService", "B", "loggingClientService", "LS9/b;", "C", "LS9/b;", "getEventService", "()LS9/b;", "eventService", "D", "getLoggingEventService", "loggingEventService", "LD9/b;", "E", "Lkotlin/Lazy;", "z3", "()LD9/b;", "responseHandlersProcessor", "Landroid/content/ClipboardManager;", "F", "K2", "()Landroid/content/ClipboardManager;", "clipboardManager", "LT8/i;", "a", "()LT8/i;", "transitionSafeCurrentActivityWatchdog", "Lka/l;", "J", "()Lka/l;", "overlayInAppPresenter", "LT8/e;", "I", "()LT8/e;", "activityLifecycleActionRegistry", "LT8/f;", "M", "()LT8/f;", "activityLifecycleWatchdog", "Ly9/f;", "K", "A3", "()Ly9/f;", "restClient", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "L", "Landroid/content/SharedPreferences;", "oldSharedPrefs", "D3", "()Landroid/content/SharedPreferences;", "sharedPreferences", "N", "E3", "sharedPreferencesV3", "LH9/l;", "", "()LH9/l;", "contactTokenStorage", "P", "clientStateStorage", "Q", "u3", "pushTokenStorage", "R", "localPushTokenStorage", "Lv9/a;", "S", "()Lv9/a;", "uuidProvider", "T", "H2", "clientIdStorage", "U", "Q2", "()Lf9/b;", "Ld9/b;", "R2", "()Ld9/b;", "crypto", "Ls9/a;", "W", "G2", "()Ls9/a;", "clientIdProvider", "Lj9/c;", "X", "()Lj9/c;", "deviceInfo", "Lu9/a;", "Y", "()Lu9/a;", "timestampProvider", "v3", "refreshTokenStorage", "a0", "M2", "contactFieldValueStorage", "LDa/b;", "b0", "B3", "()LDa/b;", "sessionIdHolder", "LW9/k;", "c0", "()LW9/k;", "requestContext", "d0", "d3", "()Lka/e;", "inAppEventHandlerInternal", "LF9/a;", "e0", "C3", "()Lg9/c;", "shardRepository", "Lpa/a;", "f0", "F2", "buttonClickedRepository", "Lqa/a;", "g0", "W2", "displayedIamRepository", "h0", "y3", "requestModelRepository", "La9/e;", "i0", "L2", "()La9/e;", "connectionWatchdog", "LS8/b;", "j0", "O2", "()LS8/b;", "coreCompletionHandler", "k0", "J2", "clientServiceStorage", "l0", "Y2", "eventServiceStorage", "m0", "U2", "deepLinkServiceStorage", "n0", "k3", "messageInboxServiceStorage", "o0", "V2", "deviceEventStateStorage", "p0", "b3", "geofenceInitialEnterTriggerEnabledStorage", "Ll9/b;", "q0", "I2", "()Ll9/b;", "clientServiceEndpointProvider", "r0", "X2", "eventServiceEndpointProvider", "s0", "T2", "deepLinkServiceProvider", "t0", "j3", "messageInboxServiceProvider", "LFa/b;", "u0", "x3", "()LFa/b;", "requestModelHelper", "Lya/b;", "v0", "P2", "()Lya/b;", "coreCompletionHandlerRefreshTokenProxyProvider", "LP9/p;", "w0", "G3", "()LP9/p;", "worker", "Ly9/b;", "x0", "w3", "()Ly9/b;", "requestManager", "Lya/c;", "y0", "l3", "()Lya/c;", "mobileEngageRequestModelFactory", "LW9/j;", "z0", "()LW9/j;", "loggingMobileEngageInternal", "Lha/c;", "A0", "()Lha/c;", "eventServiceInternal", "B0", "getLoggingEventServiceInternal", "loggingEventServiceInternal", "LDa/a;", "C0", "m3", "()LDa/a;", "mobileEngageSession", "Lha/a;", "D0", "n3", "()Lha/a;", "notificationCacheableEventHandler", "E0", "F3", "silentMessageCacheableEventHandler", "Lxa/g;", "F0", "()Lxa/g;", "notificationInformationListenerProvider", "Lxa/j;", "G0", "()Lxa/j;", "silentNotificationInformationListenerProvider", "H0", "mobileEngageInternal", "Lca/a;", "I0", "()Lca/a;", "clientServiceInternal", "J0", "loggingClientServiceInternal", "", "K0", "getMessageInboxInternal", "()Ljava/lang/Object;", "messageInboxInternal", "L0", "getLoggingMessageInboxInternal", "loggingMessageInboxInternal", "Lka/f;", "M0", "e3", "()Lka/f;", "inAppInternal", "N0", "getLoggingInAppInternal", "loggingInAppInternal", "Lda/b;", "O0", "S2", "()Lda/b;", "deepLinkInternal", "Lxa/h;", "P0", "()Lxa/h;", "pushInternal", "Q0", "loggingPushInternal", "Lta/d;", "R0", "()Lta/d;", "webViewFactory", "Lr9/a;", "S0", "()Lr9/a;", "currentActivityProvider", "Lna/h;", "T0", "c3", "()Lna/h;", "iamJsBridgeFactory", "Lna/u;", "U0", "f3", "()Lna/u;", "jsCommandFactoryProvider", "Lkotlin/Function0;", "Lcom/emarsys/mobileengage/iam/jsbridge/OnCloseListener;", "V0", "Lkotlin/jvm/functions/Function0;", "h3", "()Lkotlin/jvm/functions/Function0;", "jsOnCloseListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "property", "Lorg/json/JSONObject;", "json", "Lcom/emarsys/mobileengage/iam/jsbridge/OnAppEventListener;", "W0", "Lkotlin/jvm/functions/Function2;", "g3", "()Lkotlin/jvm/functions/Function2;", "jsOnAppEventListener", "X0", "deviceInfoPayloadStorage", "Y0", "d", "logLevelStorage", "Lxa/i;", "Z0", "t3", "()Lxa/i;", "pushTokenProvider", "a1", "o3", "onEventActionCacheableEventHandler", "Lva/a;", "b1", "()Lva/a;", "notificationActionCommandFactory", "c1", "silentMessageActionCommandFactory", "d1", "a3", "geofenceCacheableEventHandler", "LLd/c;", "e1", "Z2", "()LLd/c;", "fusedLocationProviderClient", "Lia/n;", "f1", "()Lia/n;", "geofenceInternal", "g1", "getLoggingGeofenceInternal", "loggingGeofenceInternal", "LAa/g;", "h1", "N2", "()LAa/g;", "contactTokenResponseHandler", "LCa/b;", "i1", "()LCa/b;", "remoteMessageMapperFactory", "LI9/f;", "j1", "()LI9/f;", "fileDownloader", "LY8/e;", "k1", "()LY8/e;", "appLifecycleObserver", "LH9/h;", "l1", "i3", "()LH9/h;", "keyValueStore", "LMa/b;", "m1", "p3", "()LMa/b;", "predictRequestContext", "LQ8/c;", "n1", "()LQ8/c;", "configInternal", "Le9/a;", "o1", "()Le9/a;", "coreSQLiteDatabase", "Ljava/lang/Runnable;", "p1", "()Ljava/lang/Runnable;", "logShardTrigger", "LK9/e;", "q1", "()LK9/e;", "logger", "LLa/a;", "r1", "q3", "()LLa/a;", "predictRequestModelBuilderProvider", "LHa/e;", "s1", "()LHa/e;", "predictInternal", "t1", "loggingPredictInternal", "u1", "predictShardTrigger", "v1", "r3", "predictServiceProvider", "w1", "s3", "predictServiceStorage", "Ljava/lang/Class;", "()Ljava/lang/Class;", "notificationOpenedActivityClass", "x1", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class V0 implements Y0 {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final O8.b clientService;

    /* renamed from: A0, reason: collision with root package name and from kotlin metadata */
    private final Lazy eventServiceInternal;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final O8.b loggingClientService;

    /* renamed from: B0, reason: collision with root package name and from kotlin metadata */
    private final Lazy loggingEventServiceInternal;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final S9.b eventService;

    /* renamed from: C0, reason: collision with root package name and from kotlin metadata */
    private final Lazy mobileEngageSession;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final S9.b loggingEventService;

    /* renamed from: D0, reason: collision with root package name and from kotlin metadata */
    private final Lazy notificationCacheableEventHandler;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy responseHandlersProcessor;

    /* renamed from: E0, reason: collision with root package name and from kotlin metadata */
    private final Lazy silentMessageCacheableEventHandler;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Lazy clipboardManager;

    /* renamed from: F0, reason: collision with root package name and from kotlin metadata */
    private final Lazy notificationInformationListenerProvider;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Lazy transitionSafeCurrentActivityWatchdog;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private final Lazy silentNotificationInformationListenerProvider;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Lazy overlayInAppPresenter;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private final Lazy mobileEngageInternal;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final Lazy activityLifecycleActionRegistry;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private final Lazy clientServiceInternal;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Lazy activityLifecycleWatchdog;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private final Lazy loggingClientServiceInternal;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Lazy restClient;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    private final Lazy messageInboxInternal;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences oldSharedPrefs;

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata */
    private final Lazy loggingMessageInboxInternal;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final Lazy sharedPreferences;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    private final Lazy inAppInternal;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Lazy sharedPreferencesV3;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata */
    private final Lazy loggingInAppInternal;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Lazy contactTokenStorage;

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata */
    private final Lazy deepLinkInternal;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final Lazy clientStateStorage;

    /* renamed from: P0, reason: collision with root package name and from kotlin metadata */
    private final Lazy pushInternal;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final Lazy pushTokenStorage;

    /* renamed from: Q0, reason: collision with root package name and from kotlin metadata */
    private final Lazy loggingPushInternal;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final Lazy localPushTokenStorage;

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    private final Lazy webViewFactory;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Lazy uuidProvider;

    /* renamed from: S0, reason: collision with root package name and from kotlin metadata */
    private final Lazy currentActivityProvider;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final Lazy clientIdStorage;

    /* renamed from: T0, reason: collision with root package name and from kotlin metadata */
    private final Lazy iamJsBridgeFactory;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Lazy coreDbHelper;

    /* renamed from: U0, reason: collision with root package name and from kotlin metadata */
    private final Lazy jsCommandFactoryProvider;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final Lazy crypto;

    /* renamed from: V0, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> jsOnCloseListener;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private final Lazy clientIdProvider;

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata */
    private final Function2<String, JSONObject, Unit> jsOnAppEventListener;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final Lazy deviceInfo;

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    private final Lazy deviceInfoPayloadStorage;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final Lazy timestampProvider;

    /* renamed from: Y0, reason: collision with root package name and from kotlin metadata */
    private final Lazy logLevelStorage;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final Lazy refreshTokenStorage;

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    private final Lazy pushTokenProvider;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final Lazy contactFieldValueStorage;

    /* renamed from: a1, reason: collision with root package name and from kotlin metadata */
    private final Lazy onEventActionCacheableEventHandler;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final Lazy sessionIdHolder;

    /* renamed from: b1, reason: collision with root package name and from kotlin metadata */
    private final Lazy notificationActionCommandFactory;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final Lazy requestContext;

    /* renamed from: c1, reason: collision with root package name and from kotlin metadata */
    private final Lazy silentMessageActionCommandFactory;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private final Lazy inAppEventHandlerInternal;

    /* renamed from: d1, reason: collision with root package name and from kotlin metadata */
    private final Lazy geofenceCacheableEventHandler;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isHuaweiServiceAvailable;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final Lazy shardRepository;

    /* renamed from: e1, reason: collision with root package name and from kotlin metadata */
    private final Lazy fusedLocationProviderClient;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isGoogleAvailable;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private final Lazy buttonClickedRepository;

    /* renamed from: f1, reason: collision with root package name and from kotlin metadata */
    private final Lazy geofenceInternal;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isGooglePlayServiceAvailable;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private final Lazy displayedIamRepository;

    /* renamed from: g1, reason: collision with root package name and from kotlin metadata */
    private final Lazy loggingGeofenceInternal;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final Lazy requestModelRepository;

    /* renamed from: h1, reason: collision with root package name and from kotlin metadata */
    private final Lazy contactTokenResponseHandler;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Q9.b deepLink;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private final Lazy connectionWatchdog;

    /* renamed from: i1, reason: collision with root package name and from kotlin metadata */
    private final Lazy remoteMessageMapperFactory;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final V9.b messageInbox;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private final Lazy coreCompletionHandler;

    /* renamed from: j1, reason: collision with root package name and from kotlin metadata */
    private final Lazy fileDownloader;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final V9.b loggingMessageInbox;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private final Lazy clientServiceStorage;

    /* renamed from: k1, reason: collision with root package name and from kotlin metadata */
    private final Lazy appLifecycleObserver;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final U9.b inApp;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private final Lazy eventServiceStorage;

    /* renamed from: l1, reason: collision with root package name and from kotlin metadata */
    private final Lazy keyValueStore;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final U9.b loggingInApp;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private final Lazy deepLinkServiceStorage;

    /* renamed from: m1, reason: collision with root package name and from kotlin metadata */
    private final Lazy predictRequestContext;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Ga.b onEventAction;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private final Lazy messageInboxServiceStorage;

    /* renamed from: n1, reason: collision with root package name and from kotlin metadata */
    private final Lazy configInternal;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Ga.b loggingOnEventAction;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private final Lazy deviceEventStateStorage;

    /* renamed from: o1, reason: collision with root package name and from kotlin metadata */
    private final Lazy coreSQLiteDatabase;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Qa.b push;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private final Lazy geofenceInitialEnterTriggerEnabledStorage;

    /* renamed from: p1, reason: collision with root package name and from kotlin metadata */
    private final Lazy logShardTrigger;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Qa.b loggingPush;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private final Lazy clientServiceEndpointProvider;

    /* renamed from: q1, reason: collision with root package name and from kotlin metadata */
    private final Lazy logger;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Ha.d predict;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private final Lazy eventServiceEndpointProvider;

    /* renamed from: r1, reason: collision with root package name and from kotlin metadata */
    private final Lazy predictRequestModelBuilderProvider;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Ha.d loggingPredict;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private final Lazy deepLinkServiceProvider;

    /* renamed from: s1, reason: collision with root package name and from kotlin metadata */
    private final Lazy predictInternal;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Q8.b config;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final Lazy messageInboxServiceProvider;

    /* renamed from: t1, reason: collision with root package name and from kotlin metadata */
    private final Lazy loggingPredictInternal;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final T9.b geofence;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final Lazy requestModelHelper;

    /* renamed from: u1, reason: collision with root package name and from kotlin metadata */
    private final Lazy predictShardTrigger;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final T9.b loggingGeofence;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final Lazy coreCompletionHandlerRefreshTokenProxyProvider;

    /* renamed from: v1, reason: collision with root package name and from kotlin metadata */
    private final Lazy predictServiceProvider;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final W9.i mobileEngage;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private final Lazy worker;

    /* renamed from: w1, reason: collision with root package name and from kotlin metadata */
    private final Lazy predictServiceStorage;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final W9.i loggingMobileEngage;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private final Lazy requestManager;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Ha.h predictRestricted;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private final Lazy mobileEngageRequestModelFactory;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Ha.h loggingPredictRestricted;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private final Lazy loggingMobileEngageInternal;

    public V0(final EmarsysConfig config) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zBooleanValue;
        Intrinsics.j(config, "config");
        try {
            Class<?> cls = Class.forName("com.emarsys.HuaweiServiceChecker", true, config.getApplication().getClassLoader());
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            Class[] clsArr = (Class[]) CollectionsKt.e(Context.class).toArray(new Class[0]);
            Method declaredMethod = cls.getDeclaredMethod("check", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Intrinsics.i(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(objNewInstance, config.getApplication().getApplicationContext());
            Intrinsics.h(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            zBooleanValue = ((Boolean) objInvoke).booleanValue();
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        this.isHuaweiServiceAvailable = zBooleanValue;
        boolean z10 = C14724g.f().g(config.getApplication()) == 0;
        this.isGoogleAvailable = z10;
        this.isGooglePlayServiceAvailable = z10 == zBooleanValue || !zBooleanValue;
        n9.b bVarA = Z8.a.f43644a.a();
        this.concurrentHandlerHolder = bVarA;
        Q9.a aVar = new Q9.a(false, 1, null);
        Object objNewProxyInstance = Proxy.newProxyInstance(aVar.getClass().getClassLoader(), aVar.getClass().getInterfaces(), new U8.d(aVar));
        if (objNewProxyInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.deeplink.DeepLinkApi");
        }
        Q9.b bVar = (Q9.b) objNewProxyInstance;
        Object objNewProxyInstance2 = Proxy.newProxyInstance(bVar.getClass().getClassLoader(), bVar.getClass().getInterfaces(), new U8.b(bVar, bVarA, 5L));
        if (objNewProxyInstance2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.deeplink.DeepLinkApi");
        }
        this.deepLink = (Q9.b) objNewProxyInstance2;
        V9.a aVar2 = new V9.a(false, 1, null);
        Object objNewProxyInstance3 = Proxy.newProxyInstance(aVar2.getClass().getClassLoader(), aVar2.getClass().getInterfaces(), new U8.d(aVar2));
        if (objNewProxyInstance3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.inbox.MessageInboxApi");
        }
        V9.b bVar2 = (V9.b) objNewProxyInstance3;
        Object objNewProxyInstance4 = Proxy.newProxyInstance(bVar2.getClass().getClassLoader(), bVar2.getClass().getInterfaces(), new U8.b(bVar2, bVarA, 5L));
        if (objNewProxyInstance4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.inbox.MessageInboxApi");
        }
        this.messageInbox = (V9.b) objNewProxyInstance4;
        V9.a aVar3 = new V9.a(true);
        Object objNewProxyInstance5 = Proxy.newProxyInstance(aVar3.getClass().getClassLoader(), aVar3.getClass().getInterfaces(), new U8.d(aVar3));
        if (objNewProxyInstance5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.inbox.MessageInboxApi");
        }
        V9.b bVar3 = (V9.b) objNewProxyInstance5;
        Object objNewProxyInstance6 = Proxy.newProxyInstance(bVar3.getClass().getClassLoader(), bVar3.getClass().getInterfaces(), new U8.b(bVar3, bVarA, 5L));
        if (objNewProxyInstance6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.inbox.MessageInboxApi");
        }
        this.loggingMessageInbox = (V9.b) objNewProxyInstance6;
        U9.a aVar4 = new U9.a(false, 1, null);
        Object objNewProxyInstance7 = Proxy.newProxyInstance(aVar4.getClass().getClassLoader(), aVar4.getClass().getInterfaces(), new U8.d(aVar4));
        if (objNewProxyInstance7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.inapp.InAppApi");
        }
        U9.b bVar4 = (U9.b) objNewProxyInstance7;
        Object objNewProxyInstance8 = Proxy.newProxyInstance(bVar4.getClass().getClassLoader(), bVar4.getClass().getInterfaces(), new U8.b(bVar4, bVarA, 5L));
        if (objNewProxyInstance8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.inapp.InAppApi");
        }
        this.inApp = (U9.b) objNewProxyInstance8;
        U9.a aVar5 = new U9.a(true);
        Object objNewProxyInstance9 = Proxy.newProxyInstance(aVar5.getClass().getClassLoader(), aVar5.getClass().getInterfaces(), new U8.d(aVar5));
        if (objNewProxyInstance9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.inapp.InAppApi");
        }
        U9.b bVar5 = (U9.b) objNewProxyInstance9;
        Object objNewProxyInstance10 = Proxy.newProxyInstance(bVar5.getClass().getClassLoader(), bVar5.getClass().getInterfaces(), new U8.b(bVar5, bVarA, 5L));
        if (objNewProxyInstance10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.inapp.InAppApi");
        }
        this.loggingInApp = (U9.b) objNewProxyInstance10;
        Ga.a aVar6 = new Ga.a();
        Object objNewProxyInstance11 = Proxy.newProxyInstance(aVar6.getClass().getClassLoader(), aVar6.getClass().getInterfaces(), new U8.d(aVar6));
        if (objNewProxyInstance11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.oneventaction.OnEventActionApi");
        }
        Ga.b bVar6 = (Ga.b) objNewProxyInstance11;
        Object objNewProxyInstance12 = Proxy.newProxyInstance(bVar6.getClass().getClassLoader(), bVar6.getClass().getInterfaces(), new U8.b(bVar6, bVarA, 5L));
        if (objNewProxyInstance12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.oneventaction.OnEventActionApi");
        }
        this.onEventAction = (Ga.b) objNewProxyInstance12;
        Ga.a aVar7 = new Ga.a();
        Object objNewProxyInstance13 = Proxy.newProxyInstance(aVar7.getClass().getClassLoader(), aVar7.getClass().getInterfaces(), new U8.d(aVar7));
        if (objNewProxyInstance13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.oneventaction.OnEventActionApi");
        }
        Ga.b bVar7 = (Ga.b) objNewProxyInstance13;
        Object objNewProxyInstance14 = Proxy.newProxyInstance(bVar7.getClass().getClassLoader(), bVar7.getClass().getInterfaces(), new U8.b(bVar7, bVarA, 5L));
        if (objNewProxyInstance14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.oneventaction.OnEventActionApi");
        }
        this.loggingOnEventAction = (Ga.b) objNewProxyInstance14;
        Qa.a aVar8 = new Qa.a(false, 1, null);
        Object objNewProxyInstance15 = Proxy.newProxyInstance(aVar8.getClass().getClassLoader(), aVar8.getClass().getInterfaces(), new U8.d(aVar8));
        if (objNewProxyInstance15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.push.PushApi");
        }
        Qa.b bVar8 = (Qa.b) objNewProxyInstance15;
        Object objNewProxyInstance16 = Proxy.newProxyInstance(bVar8.getClass().getClassLoader(), bVar8.getClass().getInterfaces(), new U8.b(bVar8, bVarA, 5L));
        if (objNewProxyInstance16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.push.PushApi");
        }
        this.push = (Qa.b) objNewProxyInstance16;
        Qa.a aVar9 = new Qa.a(true);
        Object objNewProxyInstance17 = Proxy.newProxyInstance(aVar9.getClass().getClassLoader(), aVar9.getClass().getInterfaces(), new U8.d(aVar9));
        if (objNewProxyInstance17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.push.PushApi");
        }
        Qa.b bVar9 = (Qa.b) objNewProxyInstance17;
        Object objNewProxyInstance18 = Proxy.newProxyInstance(bVar9.getClass().getClassLoader(), bVar9.getClass().getInterfaces(), new U8.b(bVar9, bVarA, 5L));
        if (objNewProxyInstance18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.push.PushApi");
        }
        this.loggingPush = (Qa.b) objNewProxyInstance18;
        Ha.c cVar = new Ha.c(false, 1, null);
        Object objNewProxyInstance19 = Proxy.newProxyInstance(cVar.getClass().getClassLoader(), cVar.getClass().getInterfaces(), new U8.d(cVar));
        if (objNewProxyInstance19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictApi");
        }
        Ha.d dVar = (Ha.d) objNewProxyInstance19;
        Object objNewProxyInstance20 = Proxy.newProxyInstance(dVar.getClass().getClassLoader(), dVar.getClass().getInterfaces(), new U8.b(dVar, bVarA, 5L));
        if (objNewProxyInstance20 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictApi");
        }
        this.predict = (Ha.d) objNewProxyInstance20;
        Ha.c cVar2 = new Ha.c(true);
        Object objNewProxyInstance21 = Proxy.newProxyInstance(cVar2.getClass().getClassLoader(), cVar2.getClass().getInterfaces(), new U8.d(cVar2));
        if (objNewProxyInstance21 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictApi");
        }
        Ha.d dVar2 = (Ha.d) objNewProxyInstance21;
        Object objNewProxyInstance22 = Proxy.newProxyInstance(dVar2.getClass().getClassLoader(), dVar2.getClass().getInterfaces(), new U8.b(dVar2, bVarA, 5L));
        if (objNewProxyInstance22 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictApi");
        }
        this.loggingPredict = (Ha.d) objNewProxyInstance22;
        Q8.a aVar10 = new Q8.a();
        Object objNewProxyInstance23 = Proxy.newProxyInstance(aVar10.getClass().getClassLoader(), aVar10.getClass().getInterfaces(), new U8.d(aVar10));
        if (objNewProxyInstance23 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.config.ConfigApi");
        }
        Q8.b bVar10 = (Q8.b) objNewProxyInstance23;
        Object objNewProxyInstance24 = Proxy.newProxyInstance(bVar10.getClass().getClassLoader(), bVar10.getClass().getInterfaces(), new U8.b(bVar10, bVarA, 5L));
        if (objNewProxyInstance24 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.config.ConfigApi");
        }
        this.config = (Q8.b) objNewProxyInstance24;
        T9.a aVar11 = new T9.a(false, 1, null);
        Object objNewProxyInstance25 = Proxy.newProxyInstance(aVar11.getClass().getClassLoader(), aVar11.getClass().getInterfaces(), new U8.d(aVar11));
        if (objNewProxyInstance25 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.geofence.GeofenceApi");
        }
        T9.b bVar11 = (T9.b) objNewProxyInstance25;
        Object objNewProxyInstance26 = Proxy.newProxyInstance(bVar11.getClass().getClassLoader(), bVar11.getClass().getInterfaces(), new U8.b(bVar11, bVarA, 5L));
        if (objNewProxyInstance26 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.geofence.GeofenceApi");
        }
        this.geofence = (T9.b) objNewProxyInstance26;
        T9.a aVar12 = new T9.a(true);
        Object objNewProxyInstance27 = Proxy.newProxyInstance(aVar12.getClass().getClassLoader(), aVar12.getClass().getInterfaces(), new U8.d(aVar12));
        if (objNewProxyInstance27 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.geofence.GeofenceApi");
        }
        T9.b bVar12 = (T9.b) objNewProxyInstance27;
        Object objNewProxyInstance28 = Proxy.newProxyInstance(bVar12.getClass().getClassLoader(), bVar12.getClass().getInterfaces(), new U8.b(bVar12, bVarA, 5L));
        if (objNewProxyInstance28 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.geofence.GeofenceApi");
        }
        this.loggingGeofence = (T9.b) objNewProxyInstance28;
        W9.h hVar = new W9.h(false, 1, null);
        Object objNewProxyInstance29 = Proxy.newProxyInstance(hVar.getClass().getClassLoader(), hVar.getClass().getInterfaces(), new U8.d(hVar));
        if (objNewProxyInstance29 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.MobileEngageApi");
        }
        W9.i iVar = (W9.i) objNewProxyInstance29;
        Object objNewProxyInstance30 = Proxy.newProxyInstance(iVar.getClass().getClassLoader(), iVar.getClass().getInterfaces(), new U8.b(iVar, bVarA, 5L));
        if (objNewProxyInstance30 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.MobileEngageApi");
        }
        this.mobileEngage = (W9.i) objNewProxyInstance30;
        W9.h hVar2 = new W9.h(true);
        Object objNewProxyInstance31 = Proxy.newProxyInstance(hVar2.getClass().getClassLoader(), hVar2.getClass().getInterfaces(), new U8.d(hVar2));
        if (objNewProxyInstance31 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.MobileEngageApi");
        }
        W9.i iVar2 = (W9.i) objNewProxyInstance31;
        Object objNewProxyInstance32 = Proxy.newProxyInstance(iVar2.getClass().getClassLoader(), iVar2.getClass().getInterfaces(), new U8.b(iVar2, bVarA, 5L));
        if (objNewProxyInstance32 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.MobileEngageApi");
        }
        this.loggingMobileEngage = (W9.i) objNewProxyInstance32;
        Ha.g gVar = new Ha.g(false, 1, null);
        Object objNewProxyInstance33 = Proxy.newProxyInstance(gVar.getClass().getClassLoader(), gVar.getClass().getInterfaces(), new U8.d(gVar));
        if (objNewProxyInstance33 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictRestrictedApi");
        }
        Ha.h hVar3 = (Ha.h) objNewProxyInstance33;
        Object objNewProxyInstance34 = Proxy.newProxyInstance(hVar3.getClass().getClassLoader(), hVar3.getClass().getInterfaces(), new U8.b(hVar3, bVarA, 5L));
        if (objNewProxyInstance34 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictRestrictedApi");
        }
        this.predictRestricted = (Ha.h) objNewProxyInstance34;
        Ha.g gVar2 = new Ha.g(true);
        Object objNewProxyInstance35 = Proxy.newProxyInstance(gVar2.getClass().getClassLoader(), gVar2.getClass().getInterfaces(), new U8.d(gVar2));
        if (objNewProxyInstance35 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictRestrictedApi");
        }
        Ha.h hVar4 = (Ha.h) objNewProxyInstance35;
        Object objNewProxyInstance36 = Proxy.newProxyInstance(hVar4.getClass().getClassLoader(), hVar4.getClass().getInterfaces(), new U8.b(hVar4, bVarA, 5L));
        if (objNewProxyInstance36 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictRestrictedApi");
        }
        this.loggingPredictRestricted = (Ha.h) objNewProxyInstance36;
        O8.a aVar13 = new O8.a(false, 1, null);
        Object objNewProxyInstance37 = Proxy.newProxyInstance(aVar13.getClass().getClassLoader(), aVar13.getClass().getInterfaces(), new U8.d(aVar13));
        if (objNewProxyInstance37 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.clientservice.ClientServiceApi");
        }
        O8.b bVar13 = (O8.b) objNewProxyInstance37;
        Object objNewProxyInstance38 = Proxy.newProxyInstance(bVar13.getClass().getClassLoader(), bVar13.getClass().getInterfaces(), new U8.b(bVar13, bVarA, 5L));
        if (objNewProxyInstance38 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.clientservice.ClientServiceApi");
        }
        this.clientService = (O8.b) objNewProxyInstance38;
        O8.a aVar14 = new O8.a(true);
        Object objNewProxyInstance39 = Proxy.newProxyInstance(aVar14.getClass().getClassLoader(), aVar14.getClass().getInterfaces(), new U8.d(aVar14));
        if (objNewProxyInstance39 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.clientservice.ClientServiceApi");
        }
        O8.b bVar14 = (O8.b) objNewProxyInstance39;
        Object objNewProxyInstance40 = Proxy.newProxyInstance(bVar14.getClass().getClassLoader(), bVar14.getClass().getInterfaces(), new U8.b(bVar14, bVarA, 5L));
        if (objNewProxyInstance40 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.clientservice.ClientServiceApi");
        }
        this.loggingClientService = (O8.b) objNewProxyInstance40;
        S9.a aVar15 = new S9.a(false, 1, null);
        Object objNewProxyInstance41 = Proxy.newProxyInstance(aVar15.getClass().getClassLoader(), aVar15.getClass().getInterfaces(), new U8.d(aVar15));
        if (objNewProxyInstance41 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.eventservice.EventServiceApi");
        }
        S9.b bVar15 = (S9.b) objNewProxyInstance41;
        Object objNewProxyInstance42 = Proxy.newProxyInstance(bVar15.getClass().getClassLoader(), bVar15.getClass().getInterfaces(), new U8.b(bVar15, bVarA, 5L));
        if (objNewProxyInstance42 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.eventservice.EventServiceApi");
        }
        this.eventService = (S9.b) objNewProxyInstance42;
        S9.a aVar16 = new S9.a(true);
        Object objNewProxyInstance43 = Proxy.newProxyInstance(aVar16.getClass().getClassLoader(), aVar16.getClass().getInterfaces(), new U8.d(aVar16));
        if (objNewProxyInstance43 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.eventservice.EventServiceApi");
        }
        S9.b bVar16 = (S9.b) objNewProxyInstance43;
        Object objNewProxyInstance44 = Proxy.newProxyInstance(bVar16.getClass().getClassLoader(), bVar16.getClass().getInterfaces(), new U8.b(bVar16, bVarA, 5L));
        if (objNewProxyInstance44 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.eventservice.EventServiceApi");
        }
        this.loggingEventService = (S9.b) objNewProxyInstance44;
        this.responseHandlersProcessor = LazyKt.b(new Function0() { // from class: R9.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.E4();
            }
        });
        this.clipboardManager = LazyKt.b(new Function0() { // from class: R9.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.b2(config);
            }
        });
        this.transitionSafeCurrentActivityWatchdog = LazyKt.b(new Function0() { // from class: R9.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.O4(this.f32242a);
            }
        });
        this.overlayInAppPresenter = LazyKt.b(new Function0() { // from class: R9.A
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.o4(this.f32043a);
            }
        });
        this.activityLifecycleActionRegistry = LazyKt.b(new Function0() { // from class: R9.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.R1(this.f32070a);
            }
        });
        this.activityLifecycleWatchdog = LazyKt.b(new Function0() { // from class: R9.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.S1(this.f32216a);
            }
        });
        this.restClient = LazyKt.b(new Function0() { // from class: R9.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.F4(this.f32236a);
            }
        });
        this.oldSharedPrefs = config.getApplication().getSharedPreferences("emarsys_shared_preferences", 0);
        this.sharedPreferences = LazyKt.b(new Function0() { // from class: R9.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.J4(config, this);
            }
        });
        this.sharedPreferencesV3 = LazyKt.b(new Function0() { // from class: R9.J0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.I4(config, this);
            }
        });
        this.contactTokenStorage = LazyKt.b(new Function0() { // from class: R9.R0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.g2(this.f32075a);
            }
        });
        this.clientStateStorage = LazyKt.b(new Function0() { // from class: R9.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.a2(this.f32235a);
            }
        });
        this.pushTokenStorage = LazyKt.b(new Function0() { // from class: R9.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.x4(this.f32258a);
            }
        });
        this.localPushTokenStorage = LazyKt.b(new Function0() { // from class: R9.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.S3(this.f32058a);
            }
        });
        this.uuidProvider = LazyKt.b(new Function0() { // from class: R9.T
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.P4();
            }
        });
        this.clientIdStorage = LazyKt.b(new Function0() { // from class: R9.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.W1(this.f32224a);
            }
        });
        this.coreDbHelper = LazyKt.b(new Function0() { // from class: R9.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.j2(config);
            }
        });
        this.crypto = LazyKt.b(new Function0() { // from class: R9.A0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.o2(this.f32044a);
            }
        });
        this.clientIdProvider = LazyKt.b(new Function0() { // from class: R9.L0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.V1(this.f32068a, config);
            }
        });
        this.deviceInfo = LazyKt.b(new Function0() { // from class: R9.U0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.v2(config, this);
            }
        });
        this.timestampProvider = LazyKt.b(new Function0() { // from class: R9.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.N4();
            }
        });
        this.refreshTokenStorage = LazyKt.b(new Function0() { // from class: R9.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.y4(this.f32222a);
            }
        });
        this.contactFieldValueStorage = LazyKt.b(new Function0() { // from class: R9.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.e2(this.f32223a);
            }
        });
        this.sessionIdHolder = LazyKt.b(new Function0() { // from class: R9.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.G4();
            }
        });
        this.requestContext = LazyKt.b(new Function0() { // from class: R9.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.A4(config, this);
            }
        });
        this.inAppEventHandlerInternal = LazyKt.b(new Function0() { // from class: R9.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.I3();
            }
        });
        this.shardRepository = LazyKt.b(new Function0() { // from class: R9.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.H4(this.f32229a);
            }
        });
        this.buttonClickedRepository = LazyKt.b(new Function0() { // from class: R9.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.U1(this.f32231a);
            }
        });
        this.displayedIamRepository = LazyKt.b(new Function0() { // from class: R9.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.w2(this.f32233a);
            }
        });
        this.requestModelRepository = LazyKt.b(new Function0() { // from class: R9.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.D4(this.f32237a);
            }
        });
        this.connectionWatchdog = LazyKt.b(new Function0() { // from class: R9.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.d2(config, this);
            }
        });
        this.coreCompletionHandler = LazyKt.b(new Function0() { // from class: R9.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.i2();
            }
        });
        this.clientServiceStorage = LazyKt.b(new Function0() { // from class: R9.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.Z1(this.f32245a);
            }
        });
        this.eventServiceStorage = LazyKt.b(new Function0() { // from class: R9.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.z2(this.f32246a);
            }
        });
        this.deepLinkServiceStorage = LazyKt.b(new Function0() { // from class: R9.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.s2(this.f32249a);
            }
        });
        this.messageInboxServiceStorage = LazyKt.b(new Function0() { // from class: R9.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.g4(this.f32252a);
            }
        });
        this.deviceEventStateStorage = LazyKt.b(new Function0() { // from class: R9.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.t2(this.f32253a);
            }
        });
        this.geofenceInitialEnterTriggerEnabledStorage = LazyKt.b(new Function0() { // from class: R9.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.D2(this.f32255a);
            }
        });
        this.clientServiceEndpointProvider = LazyKt.b(new Function0() { // from class: R9.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.X1(this.f32259a);
            }
        });
        this.eventServiceEndpointProvider = LazyKt.b(new Function0() { // from class: R9.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.x2(this.f32262a);
            }
        });
        this.deepLinkServiceProvider = LazyKt.b(new Function0() { // from class: R9.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.r2(this.f32264a);
            }
        });
        this.messageInboxServiceProvider = LazyKt.b(new Function0() { // from class: R9.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.f4(this.f32045a);
            }
        });
        this.requestModelHelper = LazyKt.b(new Function0() { // from class: R9.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.C4(this.f32047a);
            }
        });
        this.coreCompletionHandlerRefreshTokenProxyProvider = LazyKt.b(new Function0() { // from class: R9.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.h2(this.f32049a);
            }
        });
        this.worker = LazyKt.b(new Function0() { // from class: R9.E
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.R4(this.f32051a);
            }
        });
        this.requestManager = LazyKt.b(new Function0() { // from class: R9.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.B4(this.f32054a);
            }
        });
        this.mobileEngageRequestModelFactory = LazyKt.b(new Function0() { // from class: R9.G
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.i4(this.f32056a);
            }
        });
        this.loggingMobileEngageInternal = LazyKt.b(new Function0() { // from class: R9.I
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.b4();
            }
        });
        this.eventServiceInternal = LazyKt.b(new Function0() { // from class: R9.J
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.y2(this.f32063a);
            }
        });
        this.loggingEventServiceInternal = LazyKt.b(new Function0() { // from class: R9.K
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.X3();
            }
        });
        this.mobileEngageSession = LazyKt.b(new Function0() { // from class: R9.L
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.j4(this.f32067a);
            }
        });
        this.notificationCacheableEventHandler = LazyKt.b(new Function0() { // from class: R9.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.l4();
            }
        });
        this.silentMessageCacheableEventHandler = LazyKt.b(new Function0() { // from class: R9.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.L4();
            }
        });
        this.notificationInformationListenerProvider = LazyKt.b(new Function0() { // from class: R9.P
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.m4();
            }
        });
        this.silentNotificationInformationListenerProvider = LazyKt.b(new Function0() { // from class: R9.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.M4();
            }
        });
        this.mobileEngageInternal = LazyKt.b(new Function0() { // from class: R9.S
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.h4(this.f32076a);
            }
        });
        this.clientServiceInternal = LazyKt.b(new Function0() { // from class: R9.U
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.Y1(this.f32081a);
            }
        });
        this.loggingClientServiceInternal = LazyKt.b(new Function0() { // from class: R9.V
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.W3();
            }
        });
        this.messageInboxInternal = LazyKt.b(new Function0() { // from class: R9.W
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.e4(this.f32208a);
            }
        });
        this.loggingMessageInboxInternal = LazyKt.b(new Function0() { // from class: R9.X
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.a4();
            }
        });
        this.inAppInternal = LazyKt.b(new Function0() { // from class: R9.Y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.J3(this.f32212a);
            }
        });
        this.loggingInAppInternal = LazyKt.b(new Function0() { // from class: R9.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.Z3();
            }
        });
        this.deepLinkInternal = LazyKt.b(new Function0() { // from class: R9.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.q2(this.f32218a);
            }
        });
        this.pushInternal = LazyKt.b(new Function0() { // from class: R9.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.v4(this.f32220a, config);
            }
        });
        this.loggingPushInternal = LazyKt.b(new Function0() { // from class: R9.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.d4();
            }
        });
        this.webViewFactory = LazyKt.b(new Function0() { // from class: R9.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.Q4(this.f32225a);
            }
        });
        this.currentActivityProvider = LazyKt.b(new Function0() { // from class: R9.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.p2();
            }
        });
        this.iamJsBridgeFactory = LazyKt.b(new Function0() { // from class: R9.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.H3(this.f32228a);
            }
        });
        this.jsCommandFactoryProvider = LazyKt.b(new Function0() { // from class: R9.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.M3(this.f32230a);
            }
        });
        this.jsOnCloseListener = new Function0() { // from class: R9.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.P3(this.f32232a);
            }
        };
        this.jsOnAppEventListener = new Function2() { // from class: R9.k0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return V0.N3(this.f32234a, (String) obj, (JSONObject) obj2);
            }
        };
        this.deviceInfoPayloadStorage = LazyKt.b(new Function0() { // from class: R9.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.u2(this.f32238a);
            }
        });
        this.logLevelStorage = LazyKt.b(new Function0() { // from class: R9.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.T3(this.f32241a);
            }
        });
        this.pushTokenProvider = LazyKt.b(new Function0() { // from class: R9.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.w4(this.f32243a);
            }
        });
        this.onEventActionCacheableEventHandler = LazyKt.b(new Function0() { // from class: R9.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.n4();
            }
        });
        this.notificationActionCommandFactory = LazyKt.b(new Function0() { // from class: R9.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.k4(config, this);
            }
        });
        this.silentMessageActionCommandFactory = LazyKt.b(new Function0() { // from class: R9.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.K4(config, this);
            }
        });
        this.geofenceCacheableEventHandler = LazyKt.b(new Function0() { // from class: R9.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.C2();
            }
        });
        this.fusedLocationProviderClient = LazyKt.b(new Function0() { // from class: R9.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.B2(config);
            }
        });
        this.geofenceInternal = LazyKt.b(new Function0() { // from class: R9.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.E2(config, this);
            }
        });
        this.loggingGeofenceInternal = LazyKt.b(new Function0() { // from class: R9.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.Y3();
            }
        });
        this.contactTokenResponseHandler = LazyKt.b(new Function0() { // from class: R9.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.f2(this.f32263a);
            }
        });
        this.remoteMessageMapperFactory = LazyKt.b(new Function0() { // from class: R9.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.z4(config, this);
            }
        });
        this.fileDownloader = LazyKt.b(new Function0() { // from class: R9.B0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.A2(config);
            }
        });
        this.appLifecycleObserver = LazyKt.b(new Function0() { // from class: R9.C0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.T1(this.f32048a);
            }
        });
        this.keyValueStore = LazyKt.b(new Function0() { // from class: R9.D0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.R3(this.f32050a);
            }
        });
        this.predictRequestContext = LazyKt.b(new Function0() { // from class: R9.E0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.q4(config, this);
            }
        });
        this.configInternal = LazyKt.b(new Function0() { // from class: R9.F0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.c2(this.f32055a);
            }
        });
        this.coreSQLiteDatabase = LazyKt.b(new Function0() { // from class: R9.G0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.k2(this.f32057a);
            }
        });
        this.logShardTrigger = LazyKt.b(new Function0() { // from class: R9.H0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.U3(this.f32059a, config);
            }
        });
        this.logger = LazyKt.b(new Function0() { // from class: R9.I0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.V3(this.f32061a, config);
            }
        });
        this.predictRequestModelBuilderProvider = LazyKt.b(new Function0() { // from class: R9.K0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.r4(this.f32066a);
            }
        });
        this.predictInternal = LazyKt.b(new Function0() { // from class: R9.M0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.p4(this.f32071a);
            }
        });
        this.loggingPredictInternal = LazyKt.b(new Function0() { // from class: R9.N0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.c4();
            }
        });
        this.predictShardTrigger = LazyKt.b(new Function0() { // from class: R9.O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.u4(this.f32072a);
            }
        });
        this.predictServiceProvider = LazyKt.b(new Function0() { // from class: R9.P0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.s4(this.f32073a);
            }
        });
        this.predictServiceStorage = LazyKt.b(new Function0() { // from class: R9.Q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V0.t4(this.f32074a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I9.f A2(EmarsysConfig emarsysConfig) {
        return new I9.f(emarsysConfig.getApplication());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MobileEngageRequestContext A4(EmarsysConfig emarsysConfig, V0 v02) {
        return new MobileEngageRequestContext(emarsysConfig.getApplicationCode(), null, null, v02.D(), v02.T(), v02.E(), v02.A(), v02.C(), v02.v3(), v02.u3(), v02.M2(), v02.B3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y9.b B4(V0 v02) {
        return new y9.b(v02.concurrentHandlerHolder, v02.y3(), v02.C3(), v02.G3(), v02.A3(), v02.O2(), v02.O2(), v02.P2(), new P9.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14490a C2() {
        return new C14490a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fa.b C4(V0 v02) {
        return new Fa.b(v02.I2(), v02.X2(), v02.j3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.b D2(V0 v02) {
        return new H9.b(Ea.a.f7060n, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ia.i E2(EmarsysConfig emarsysConfig, V0 v02) {
        C17650a c17650a = new C17650a(emarsysConfig.getApplication(), v02.h(), v02.a3(), v02.concurrentHandlerHolder);
        ya.c cVarL3 = v02.l3();
        y9.b bVarW3 = v02.w3();
        ia.p pVar = new ia.p();
        C16412a c16412a = new C16412a(emarsysConfig.getApplication());
        InterfaceC4013c interfaceC4013cZ2 = v02.Z2();
        ia.m mVar = new ia.m(99);
        InterfaceC4017g interfaceC4017gC = C4022l.c(emarsysConfig.getApplication());
        Intrinsics.i(interfaceC4017gC, "getGeofencingClient(...)");
        return new ia.i(cVarL3, bVarW3, pVar, c16412a, interfaceC4013cZ2, mVar, interfaceC4017gC, c17650a, v02.a3(), new H9.b(Ea.a.f7057k, v02.E3()), new ia.o(emarsysConfig.getApplication()), v02.concurrentHandlerHolder, v02.b3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D9.b E4() {
        return new D9.b(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y9.f F4(V0 v02) {
        return new y9.f(new C5670b(), v02.T(), v02.z3(), v02.m2(), v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionIdHolder G4() {
        return new SessionIdHolder(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final na.h H3(V0 v02) {
        return new na.h(v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F9.b H4(V0 v02) {
        return new F9.b(v02.Q2(), v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ka.e I3() {
        return new ka.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences I4(EmarsysConfig emarsysConfig, V0 v02) {
        return new H9.k(emarsysConfig.getApplication(), "emarsys_secure_shared_preferences_v3", v02.D3(), new C13645c(), new H9.g()).getSharedPreferences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ka.c J3(V0 v02) {
        return new ka.c(v02.d3(), v02.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences J4(EmarsysConfig emarsysConfig, V0 v02) {
        Application application = emarsysConfig.getApplication();
        SharedPreferences oldSharedPrefs = v02.oldSharedPrefs;
        Intrinsics.i(oldSharedPrefs, "oldSharedPrefs");
        return new H9.j(application, "emarsys_secure_shared_preferences", oldSharedPrefs).getSharedPreferences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17650a K4(EmarsysConfig emarsysConfig, V0 v02) {
        return new C17650a(emarsysConfig.getApplication(), v02.h(), v02.F3(), v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14490a L4() {
        return new C14490a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final na.u M3(V0 v02) {
        return new na.u(v02.W(), v02.concurrentHandlerHolder, v02.e3(), v02.F2(), v02.h3(), v02.g3(), v02.T(), v02.K2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18146j M4() {
        return new C18146j(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N3(final V0 v02, final String str, final JSONObject json) {
        Intrinsics.j(json, "json");
        v02.concurrentHandlerHolder.h(new Runnable() { // from class: R9.T0
            @Override // java.lang.Runnable
            public final void run() {
                V0.O3(json, v02, str);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17361a N4() {
        return new C17361a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(JSONObject jSONObject, V0 v02, String str) {
        Y9.a aVarA;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        Activity activityA = v02.W().a();
        if (str == null || activityA == null || (aVarA = v02.e3().a()) == null) {
            return;
        }
        aVarA.a(activityA, str, jSONObjectOptJSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T8.i O4(V0 v02) {
        return new T8.i(v02.concurrentHandlerHolder.getCoreHandler(), v02.W());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17649a P4() {
        return new C17649a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(Activity activity) {
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        Fragment fragmentFindFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag("MOBILE_ENGAGE_IAM_DIALOG_TAG");
        if (fragmentFindFragmentByTag instanceof DialogFragment) {
            ((DialogFragment) fragmentFindFragmentByTag).dismiss();
        }
        if (fragmentFindFragmentByTag != null) {
            fragmentActivity.getSupportFragmentManager().beginTransaction().q(fragmentFindFragmentByTag).j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17213d Q4(V0 v02) {
        return new C17213d(v02.c3(), v02.f3(), v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final T8.e R1(V0 v02) {
        ea.b bVar = new ea.b(v02.S(), v02.u(), v02.D(), null, 0, false, 56, null);
        C13646a c13646a = new C13646a(v02.S2(), 0, false, null, 14, null);
        Object[] objArr = 0 == true ? 1 : 0;
        return new T8.e(v02.concurrentHandlerHolder, v02.W(), CollectionsKt.s(bVar, c13646a, new ia.j(v02.R(), 0 == true ? 1 : 0, false, null, 14, objArr), new ka.b(v02.h(), v02.C(), 0, false, 0 == true ? 1 : 0, 28, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.d R3(V0 v02) {
        return new H9.d(v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P9.i R4(V0 v02) {
        return new P9.i(v02.y3(), v02.L2(), v02.concurrentHandlerHolder, v02.O2(), v02.A3(), v02.P2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T8.f S1(V0 v02) {
        return new T8.f(v02.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n S3(V0 v02) {
        return new H9.n(Ea.a.f7052f, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y8.e T1(V0 v02) {
        return new Y8.e(v02.m3(), v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n T3(V0 v02) {
        return new H9.n(H9.c.f13444b, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pa.b U1(V0 v02) {
        return new pa.b(v02.Q2(), v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J9.a U3(V0 v02, EmarsysConfig emarsysConfig) {
        return new J9.a(v02.C3(), new M9.a(10), new G9.b("log_%"), new J9.b(10), new K9.b(v02.T(), v02.E(), v02.D(), emarsysConfig.getApplicationCode(), emarsysConfig.getMerchantId()), v02.w3(), a.EnumC0257a.f15675b, v02.L2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17033a V1(V0 v02, EmarsysConfig emarsysConfig) {
        C14969b c14969b = new C14969b(v02.Q2(), v02.concurrentHandlerHolder);
        C13643a c13643a = new C13643a(emarsysConfig.getSharedSecret(), v02.R2());
        return new C17033a(v02.E(), c14969b, v02.H2(), new C6493a(new C6341a(emarsysConfig.getApplication()), c13643a, emarsysConfig.f()), c13643a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K9.e V3(V0 v02, EmarsysConfig emarsysConfig) {
        return new K9.e(v02.concurrentHandlerHolder, v02.C3(), v02.T(), v02.E(), v02.d(), emarsysConfig.getVerboseConsoleLoggingEnabled(), emarsysConfig.getApplication());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n W1(V0 v02) {
        return new H9.n(H9.c.f13443a, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6496c W3() {
        return new C6496c(N8.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15476b X1(V0 v02) {
        return new C15476b(v02.J2(), "https://me-client.eservice.emarsys.net");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14493d X3() {
        return new C14493d(N8.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6495b Y1(V0 v02) {
        return new C6495b(v02.w3(), v02.l3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ia.q Y3() {
        return new ia.q(N8.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n Z1(V0 v02) {
        return new H9.n(Ea.a.f7054h, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ka.g Z3() {
        return new ka.g(N8.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n a2(V0 v02) {
        return new H9.n(Ea.a.f7049c, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17363b a4() {
        return new C17363b(N8.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W9.g b4() {
        return new W9.g(N8.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q8.g c2(V0 v02) {
        return new Q8.g(v02.v(), v02.F(), v02.P(), v02.p3(), v02.D(), v02.w3(), new N8.e(v02.v()), new Q8.i(new C17209a(), v02.G2()), v02.J2(), v02.Y2(), v02.U2(), v02.s3(), v02.k3(), v02.d(), v02.R2(), v02.S(), v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ha.b c4() {
        return new Ha.b(N8.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5673e d2(EmarsysConfig emarsysConfig, V0 v02) {
        return new C5673e(emarsysConfig.getApplication(), v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18142f d4() {
        return new C18142f(N8.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n e2(V0 v02) {
        return new H9.n(Ea.a.f7050d, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17362a e4(V0 v02) {
        return new C17362a(v02.concurrentHandlerHolder, v02.w3(), v02.l3(), new C17364c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Aa.g f2(V0 v02) {
        return new Aa.g("contactToken", v02.C(), v02.x3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15476b f4(V0 v02) {
        return new C15476b(v02.k3(), "https://me-inbox.eservice.emarsys.net/v3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n g2(V0 v02) {
        return new H9.n(Ea.a.f7048b, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n g4(V0 v02) {
        return new H9.n(Ea.a.f7055i, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya.b h2(V0 v02) {
        return new ya.b(new C18463b(v02.y3(), v02.concurrentHandlerHolder), v02.A3(), v02.C(), v02.u3(), v02.O2(), v02.x3(), v02.N2(), v02.l3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W9.f h4(V0 v02) {
        return new W9.f(v02.w3(), v02.l3(), v02.v(), v02.m3(), v02.B3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S8.b i2() {
        return new S8.b(new LinkedHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya.c i4(V0 v02) {
        return new ya.c(v02.v(), v02.I2(), v02.X2(), v02.j3(), v02.F2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13971b j2(EmarsysConfig emarsysConfig) {
        return new C13971b(emarsysConfig.getApplication(), new LinkedHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Da.a j4(V0 v02) {
        return new Da.a(v02.T(), v02.E(), v02.h(), v02.B3(), v02.C(), v02.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17650a k4(EmarsysConfig emarsysConfig, V0 v02) {
        return new C17650a(emarsysConfig.getApplication(), v02.h(), v02.n3(), v02.concurrentHandlerHolder);
    }

    private final PublicKey l2() throws InvalidKeySpecException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAELjWEUIBX9zlm1OI4gF1hMCBLzpaBwgs9HlmSIBAqP4MDGy4ibOOV3FVDrnAY0Q34LZTbPBlp3gRNZJ19UoSy2Q==", 0)));
        Intrinsics.i(publicKeyGeneratePublic, "generatePublic(...)");
        return publicKeyGeneratePublic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14490a l4() {
        return new C14490a();
    }

    private final List<S8.c<A9.c, A9.c>> m2() {
        return CollectionsKt.p(new za.e(v(), x3()), new za.f(v(), x3()), new C18465b(v(), x3()), new za.c(v()), new za.d(v(), x3(), V2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18143g m4() {
        return new C18143g(null);
    }

    private final g9.c<A9.c, g9.d> n2(C13971b coreDbHelper, ka.e inAppEventHandler) {
        return new C16877a(new A9.e(coreDbHelper, this.concurrentHandlerHolder), W2(), F2(), T(), E(), inAppEventHandler, X2(), x3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14490a n4() {
        return new C14490a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13644b o2(V0 v02) {
        return new C13644b(v02.l2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ka.l o4(V0 v02) {
        n9.b bVar = v02.concurrentHandlerHolder;
        return new ka.l(bVar, new la.c(bVar, v02.T(), v02.e3(), v02.W2(), v02.n()), v02.T(), v02.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16874a p2() {
        return new C16874a(null, new C16876c(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ha.a p4(V0 v02) {
        return new Ha.a(v02.p3(), v02.w3(), v02.concurrentHandlerHolder, v02.q3(), new Ha.f(), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final da.c q2(V0 v02) {
        return new da.c(v02.v(), v02.T2(), v02.w3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PredictRequestContext q4(EmarsysConfig emarsysConfig, V0 v02) {
        return new PredictRequestContext(emarsysConfig.getMerchantId(), v02.D(), v02.T(), v02.E(), v02.i3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15476b r2(V0 v02) {
        return new C15476b(v02.U2(), "https://deep-link.eservice.emarsys.net");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final La.a r4(V0 v02) {
        return new La.a(v02.p3(), new Ma.a(v02.p3()), v02.r3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n s2(V0 v02) {
        return new H9.n(Ea.a.f7056j, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15476b s4(V0 v02) {
        return new C15476b(v02.s3(), "https://recommender.scarabresearch.com/merchants");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n t2(V0 v02) {
        return new H9.n(Ea.a.f7058l, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n t4(V0 v02) {
        return new H9.n(Pa.a.f25752a, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n u2(V0 v02) {
        return new H9.n(Ea.a.f7059m, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J9.a u4(V0 v02) {
        return new J9.a(v02.C3(), new M9.a(1), new G9.b("predict_%"), new J9.b(1), new Oa.a(v02.p3(), v02.q3()), v02.w3(), a.EnumC0257a.f15674a, v02.L2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18140d v4(V0 v02, EmarsysConfig emarsysConfig) {
        return new C18140d(v02.w3(), v02.concurrentHandlerHolder, v02.l3(), v02.h(), v02.u3(), v02.B(), v02.n3(), v02.F3(), v02.s(), v02.r(), emarsysConfig.getAutomaticPushTokenSendingEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16617b w2(V0 v02) {
        return new C16617b(v02.Q2(), v02.concurrentHandlerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18141e w4(V0 v02) {
        return new C18141e(v02.u3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15476b x2(V0 v02) {
        return new C15476b(v02.Y2(), "https://mobile-events.eservice.emarsys.net");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n x4(V0 v02) {
        return new H9.n(Ea.a.f7051e, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14491b y2(V0 v02) {
        return new C14491b(v02.l3(), v02.w3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n y4(V0 v02) {
        return new H9.n(Ea.a.f7047a, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.n z2(V0 v02) {
        return new H9.n(Ea.a.f7053g, v02.E3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ca.b z4(EmarsysConfig emarsysConfig, V0 v02) {
        C9.a aVar = new C9.a();
        Application application = emarsysConfig.getApplication();
        Intrinsics.h(application, "null cannot be cast to non-null type android.content.Context");
        return new Ca.b(aVar, application, v02.E());
    }

    @Override // fa.InterfaceC13972a
    public H9.l<String> A() {
        return (H9.l) this.clientStateStorage.getValue();
    }

    public y9.f A3() {
        return (y9.f) this.restClient.getValue();
    }

    @Override // fa.InterfaceC13972a
    public H9.l<String> B() {
        return (H9.l) this.localPushTokenStorage.getValue();
    }

    public SessionIdHolder B3() {
        return (SessionIdHolder) this.sessionIdHolder.getValue();
    }

    @Override // fa.InterfaceC13972a
    public H9.l<String> C() {
        return (H9.l) this.contactTokenStorage.getValue();
    }

    public g9.c<F9.a, g9.d> C3() {
        return (g9.c) this.shardRepository.getValue();
    }

    @Override // k9.InterfaceC15112a
    public DeviceInfo D() {
        return (DeviceInfo) this.deviceInfo.getValue();
    }

    public final SharedPreferences D3() {
        return (SharedPreferences) this.sharedPreferences.getValue();
    }

    @Override // k9.InterfaceC15112a
    public C17649a E() {
        return (C17649a) this.uuidProvider.getValue();
    }

    public SharedPreferences E3() {
        return (SharedPreferences) this.sharedPreferencesV3.getValue();
    }

    @Override // fa.InterfaceC13972a
    public W9.j F() {
        return (W9.j) this.mobileEngageInternal.getValue();
    }

    public g9.c<ButtonClicked, g9.d> F2() {
        return (g9.c) this.buttonClickedRepository.getValue();
    }

    public C14490a F3() {
        return (C14490a) this.silentMessageCacheableEventHandler.getValue();
    }

    @Override // R9.Y0
    /* renamed from: G, reason: from getter */
    public Ha.h getLoggingPredictRestricted() {
        return this.loggingPredictRestricted;
    }

    public C17033a G2() {
        return (C17033a) this.clientIdProvider.getValue();
    }

    public P9.p G3() {
        return (P9.p) this.worker.getValue();
    }

    @Override // k9.InterfaceC15112a
    /* renamed from: H, reason: from getter */
    public final n9.b getConcurrentHandlerHolder() {
        return this.concurrentHandlerHolder;
    }

    public H9.l<String> H2() {
        return (H9.l) this.clientIdStorage.getValue();
    }

    @Override // k9.InterfaceC15112a
    public I9.f I() {
        return (I9.f) this.fileDownloader.getValue();
    }

    public C15476b I2() {
        return (C15476b) this.clientServiceEndpointProvider.getValue();
    }

    @Override // fa.InterfaceC13972a
    public ka.l J() {
        return (ka.l) this.overlayInAppPresenter.getValue();
    }

    public H9.l<String> J2() {
        return (H9.l) this.clientServiceStorage.getValue();
    }

    @Override // fa.InterfaceC13972a
    public C17650a K() {
        return (C17650a) this.notificationActionCommandFactory.getValue();
    }

    public ClipboardManager K2() {
        return (ClipboardManager) this.clipboardManager.getValue();
    }

    public final void K3(EmarsysConfig config) {
        Intrinsics.j(config, "config");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Na.a(i3(), r3()));
        arrayList.add(new Na.b(i3(), r3()));
        arrayList.add(new Aa.g("refreshToken", v3(), x3()));
        arrayList.add(N2());
        arrayList.add(new Aa.f(A(), x3()));
        arrayList.add(new Aa.a(D(), u()));
        arrayList.add(new Aa.e(J()));
        arrayList.add(new Aa.c(W2(), F2(), x3()));
        arrayList.add(new Aa.d(W2(), F2(), x3()));
        arrayList.add(new Aa.h(new C17650a(config.getApplication(), h(), o3(), this.concurrentHandlerHolder), W2(), h(), T(), this.concurrentHandlerHolder));
        arrayList.add(new Aa.b(V2(), x3()));
        z3().a(arrayList);
    }

    @Override // R9.Y0
    public Q8.c L() {
        return (Q8.c) this.configInternal.getValue();
    }

    public C5673e L2() {
        return (C5673e) this.connectionWatchdog.getValue();
    }

    /* renamed from: L3, reason: from getter */
    public boolean getIsGooglePlayServiceAvailable() {
        return this.isGooglePlayServiceAvailable;
    }

    @Override // k9.InterfaceC15112a
    public T8.f M() {
        return (T8.f) this.activityLifecycleWatchdog.getValue();
    }

    public H9.l<String> M2() {
        return (H9.l) this.contactFieldValueStorage.getValue();
    }

    @Override // Ja.a
    public Ha.e N() {
        return (Ha.e) this.loggingPredictInternal.getValue();
    }

    public Aa.g N2() {
        return (Aa.g) this.contactTokenResponseHandler.getValue();
    }

    @Override // R9.Y0
    /* renamed from: O, reason: from getter */
    public Qa.b getPush() {
        return this.push;
    }

    public S8.b O2() {
        return (S8.b) this.coreCompletionHandler.getValue();
    }

    @Override // fa.InterfaceC13972a
    public InterfaceC18144h P() {
        return (InterfaceC18144h) this.pushInternal.getValue();
    }

    public ya.b P2() {
        return (ya.b) this.coreCompletionHandlerRefreshTokenProxyProvider.getValue();
    }

    @Override // k9.InterfaceC15112a
    public Runnable Q() {
        return (Runnable) this.logShardTrigger.getValue();
    }

    public C13971b Q2() {
        return (C13971b) this.coreDbHelper.getValue();
    }

    @Override // fa.InterfaceC13972a
    public ia.n R() {
        return (ia.n) this.geofenceInternal.getValue();
    }

    public C13644b R2() {
        return (C13644b) this.crypto.getValue();
    }

    @Override // fa.InterfaceC13972a
    public InterfaceC6494a S() {
        return (InterfaceC6494a) this.clientServiceInternal.getValue();
    }

    public InterfaceC13647b S2() {
        return (InterfaceC13647b) this.deepLinkInternal.getValue();
    }

    @Override // k9.InterfaceC15112a
    public C17361a T() {
        return (C17361a) this.timestampProvider.getValue();
    }

    public C15476b T2() {
        return (C15476b) this.deepLinkServiceProvider.getValue();
    }

    @Override // k9.InterfaceC15112a
    public InterfaceC13782a U() {
        return (InterfaceC13782a) this.coreSQLiteDatabase.getValue();
    }

    public H9.l<String> U2() {
        return (H9.l) this.deepLinkServiceStorage.getValue();
    }

    @Override // R9.Y0
    /* renamed from: V, reason: from getter */
    public W9.i getMobileEngage() {
        return this.mobileEngage;
    }

    public H9.l<String> V2() {
        return (H9.l) this.deviceEventStateStorage.getValue();
    }

    @Override // fa.InterfaceC13972a
    public C16874a W() {
        return (C16874a) this.currentActivityProvider.getValue();
    }

    public g9.c<C16616a, g9.d> W2() {
        return (g9.c) this.displayedIamRepository.getValue();
    }

    public C15476b X2() {
        return (C15476b) this.eventServiceEndpointProvider.getValue();
    }

    public H9.l<String> Y2() {
        return (H9.l) this.eventServiceStorage.getValue();
    }

    public InterfaceC4013c Z2() {
        return (InterfaceC4013c) this.fusedLocationProviderClient.getValue();
    }

    @Override // k9.InterfaceC15112a
    public T8.i a() {
        return (T8.i) this.transitionSafeCurrentActivityWatchdog.getValue();
    }

    public C14490a a3() {
        return (C14490a) this.geofenceCacheableEventHandler.getValue();
    }

    @Override // R9.Y0
    /* renamed from: b, reason: from getter */
    public Q8.b getConfig() {
        return this.config;
    }

    public H9.l<Boolean> b3() {
        return (H9.l) this.geofenceInitialEnterTriggerEnabledStorage.getValue();
    }

    @Override // R9.Y0
    /* renamed from: c, reason: from getter */
    public O8.b getClientService() {
        return this.clientService;
    }

    public na.h c3() {
        return (na.h) this.iamJsBridgeFactory.getValue();
    }

    @Override // k9.InterfaceC15112a
    public H9.l<String> d() {
        return (H9.l) this.logLevelStorage.getValue();
    }

    public ka.e d3() {
        return (ka.e) this.inAppEventHandlerInternal.getValue();
    }

    @Override // Ja.a
    public Ha.e e() {
        return (Ha.e) this.predictInternal.getValue();
    }

    public ka.f e3() {
        return (ka.f) this.inAppInternal.getValue();
    }

    @Override // fa.InterfaceC13972a
    public InterfaceC18144h f() {
        return (InterfaceC18144h) this.loggingPushInternal.getValue();
    }

    public na.u f3() {
        return (na.u) this.jsCommandFactoryProvider.getValue();
    }

    @Override // k9.InterfaceC15112a
    public K9.e g() {
        return (K9.e) this.logger.getValue();
    }

    public Function2<String, JSONObject, Unit> g3() {
        return this.jsOnAppEventListener;
    }

    @Override // fa.InterfaceC13972a
    public InterfaceC14492c h() {
        return (InterfaceC14492c) this.eventServiceInternal.getValue();
    }

    public Function0<Unit> h3() {
        return this.jsOnCloseListener;
    }

    @Override // fa.InterfaceC13972a
    public Class<?> i() {
        return NotificationOpenedActivity.class;
    }

    public H9.h i3() {
        return (H9.h) this.keyValueStore.getValue();
    }

    @Override // R9.Y0
    public void j(EmarsysConfig emarsysConfig) throws JSONException {
        Intrinsics.j(emarsysConfig, "emarsysConfig");
        if (emarsysConfig.getVerboseConsoleLoggingEnabled()) {
            FS.log_d("EMARSYS_SDK", "------------CONFIG START------------");
            FS.log_d("EMARSYS_SDK", "ApplicationCode : " + emarsysConfig.getApplicationCode());
            FS.log_d("EMARSYS_SDK", "MerchantId : " + emarsysConfig.getMerchantId());
            FS.log_d("EMARSYS_SDK", "ExperimentalFeatures : " + emarsysConfig.d());
            FS.log_d("EMARSYS_SDK", "AutomaticPushSendingEnabled : " + emarsysConfig.getAutomaticPushTokenSendingEnabled());
            FS.log_d("EMARSYS_SDK", "ClientId : " + G2().d());
            FS.log_d("EMARSYS_SDK", Ea.a.f7053g + " : " + X2().a());
            FS.log_d("EMARSYS_SDK", Ea.a.f7054h + " : " + I2().a());
            FS.log_d("EMARSYS_SDK", Ea.a.f7055i + " : " + j3().a());
            FS.log_d("EMARSYS_SDK", Ea.a.f7056j + " : " + T2().a());
            FS.log_d("EMARSYS_SDK", Pa.a.f25752a + " : " + r3().a());
            FS.log_d("EMARSYS_SDK", Ea.a.f7048b + " : " + ((Object) C().get()));
            FS.log_d("EMARSYS_SDK", Ea.a.f7049c + " : " + ((Object) A().get()));
            FS.log_d("EMARSYS_SDK", Ea.a.f7047a + " : " + ((Object) v3().get()));
            Ea.a aVar = Ea.a.f7058l;
            String str = V2().get();
            if (str == null) {
                str = "{}";
            }
            FS.log_d("EMARSYS_SDK", aVar + " : " + new JSONObject(str).toString(4));
            FS.log_d("EMARSYS_SDK", Ea.a.f7057k + " : " + R().isEnabled());
            FS.log_d("EMARSYS_SDK", Ea.a.f7060n + " : " + b3().get());
            FS.log_d("EMARSYS_SDK", Ea.a.f7051e + " : " + t3().a());
            Ea.a aVar2 = Ea.a.f7059m;
            String str2 = u().get();
            if (str2 == null) {
                str2 = "-";
            }
            FS.log_d("EMARSYS_SDK", aVar2 + " : " + str2);
            FS.log_d("EMARSYS_SDK", H9.c.f13444b + " : " + ((Object) d().get()));
            FS.log_d("EMARSYS_SDK", "------------CONFIG END------------");
        }
    }

    public C15476b j3() {
        return (C15476b) this.messageInboxServiceProvider.getValue();
    }

    @Override // fa.InterfaceC13972a
    public Ca.b k() {
        return (Ca.b) this.remoteMessageMapperFactory.getValue();
    }

    public H9.l<String> k3() {
        return (H9.l) this.messageInboxServiceStorage.getValue();
    }

    @Override // fa.InterfaceC13972a
    public Y8.e l() {
        return (Y8.e) this.appLifecycleObserver.getValue();
    }

    public ya.c l3() {
        return (ya.c) this.mobileEngageRequestModelFactory.getValue();
    }

    @Override // R9.Y0
    /* renamed from: m, reason: from getter */
    public O8.b getLoggingClientService() {
        return this.loggingClientService;
    }

    public Da.a m3() {
        return (Da.a) this.mobileEngageSession.getValue();
    }

    @Override // fa.InterfaceC13972a
    public C17213d n() {
        return (C17213d) this.webViewFactory.getValue();
    }

    public C14490a n3() {
        return (C14490a) this.notificationCacheableEventHandler.getValue();
    }

    @Override // Ja.a
    public Runnable o() {
        return (Runnable) this.predictShardTrigger.getValue();
    }

    public C14490a o3() {
        return (C14490a) this.onEventActionCacheableEventHandler.getValue();
    }

    @Override // R9.Y0
    /* renamed from: p, reason: from getter */
    public Ha.h getPredictRestricted() {
        return this.predictRestricted;
    }

    public PredictRequestContext p3() {
        return (PredictRequestContext) this.predictRequestContext.getValue();
    }

    @Override // fa.InterfaceC13972a
    public C17650a q() {
        return (C17650a) this.silentMessageActionCommandFactory.getValue();
    }

    public La.a q3() {
        return (La.a) this.predictRequestModelBuilderProvider.getValue();
    }

    @Override // fa.InterfaceC13972a
    public C18146j r() {
        return (C18146j) this.silentNotificationInformationListenerProvider.getValue();
    }

    public C15476b r3() {
        return (C15476b) this.predictServiceProvider.getValue();
    }

    @Override // fa.InterfaceC13972a
    public C18143g s() {
        return (C18143g) this.notificationInformationListenerProvider.getValue();
    }

    public H9.l<String> s3() {
        return (H9.l) this.predictServiceStorage.getValue();
    }

    @Override // R9.Y0
    /* renamed from: t, reason: from getter */
    public Qa.b getLoggingPush() {
        return this.loggingPush;
    }

    public InterfaceC18145i t3() {
        return (InterfaceC18145i) this.pushTokenProvider.getValue();
    }

    @Override // fa.InterfaceC13972a
    public H9.l<String> u() {
        return (H9.l) this.deviceInfoPayloadStorage.getValue();
    }

    public H9.l<String> u3() {
        return (H9.l) this.pushTokenStorage.getValue();
    }

    @Override // fa.InterfaceC13972a
    public MobileEngageRequestContext v() {
        return (MobileEngageRequestContext) this.requestContext.getValue();
    }

    public H9.l<String> v3() {
        return (H9.l) this.refreshTokenStorage.getValue();
    }

    @Override // fa.InterfaceC13972a
    public InterfaceC6494a w() {
        return (InterfaceC6494a) this.loggingClientServiceInternal.getValue();
    }

    public y9.b w3() {
        return (y9.b) this.requestManager.getValue();
    }

    @Override // k9.InterfaceC15112a
    public T8.e x() {
        return (T8.e) this.activityLifecycleActionRegistry.getValue();
    }

    public Fa.b x3() {
        return (Fa.b) this.requestModelHelper.getValue();
    }

    @Override // R9.Y0
    /* renamed from: y, reason: from getter */
    public W9.i getLoggingMobileEngage() {
        return this.loggingMobileEngage;
    }

    public g9.c<A9.c, g9.d> y3() {
        return (g9.c) this.requestModelRepository.getValue();
    }

    @Override // fa.InterfaceC13972a
    public W9.j z() {
        return (W9.j) this.loggingMobileEngageInternal.getValue();
    }

    public D9.b z3() {
        return (D9.b) this.responseHandlersProcessor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4013c B2(EmarsysConfig emarsysConfig) {
        InterfaceC4013c interfaceC4013cB = C4022l.b(emarsysConfig.getApplication());
        Intrinsics.i(interfaceC4013cB, "getFusedLocationProviderClient(...)");
        return interfaceC4013cB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g9.c D4(V0 v02) {
        return v02.n2(v02.Q2(), v02.d3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P3(V0 v02) {
        final Activity activityA = v02.W().a();
        if (activityA instanceof FragmentActivity) {
            v02.concurrentHandlerHolder.h(new Runnable() { // from class: R9.S0
                @Override // java.lang.Runnable
                public final void run() {
                    V0.Q3(activityA);
                }
            });
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClipboardManager b2(EmarsysConfig emarsysConfig) {
        Application application = emarsysConfig.getApplication();
        Intrinsics.h(application, "null cannot be cast to non-null type android.content.Context");
        Object objJ = Z1.b.j(application, ClipboardManager.class);
        Intrinsics.h(objJ, "null cannot be cast to non-null type android.content.ClipboardManager");
        return (ClipboardManager) objJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC13782a k2(V0 v02) {
        return v02.Q2().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceInfo v2(EmarsysConfig emarsysConfig, V0 v02) {
        androidx.core.app.q qVarF = androidx.core.app.q.f(emarsysConfig.getApplication());
        Intrinsics.i(qVarF, "from(...)");
        Object systemService = emarsysConfig.getApplication().getSystemService("notification");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return new DeviceInfo(emarsysConfig.getApplication(), v02.G2(), new C17852a(), new j9.e(), new C16088a(new o9.j((NotificationManager) systemService, qVarF)), emarsysConfig.getAutomaticPushTokenSendingEnabled(), v02.getIsGooglePlayServiceAvailable());
    }
}
