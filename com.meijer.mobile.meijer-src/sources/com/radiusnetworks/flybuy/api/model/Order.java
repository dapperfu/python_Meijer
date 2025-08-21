package com.radiusnetworks.flybuy.api.model;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.mapbox.model.a;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0003\bª\u0001\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\u00100\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\u00103\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u00108\u001a\u000205\u0012\b\u00109\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010;\u001a\u000205\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010=\u001a\u000205\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010?\u001a\u000205\u0012\u0006\u0010@\u001a\u000205\u0012\b\u0010A\u001a\u0004\u0018\u00010&\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010IJ\n\u0010\u0098\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010°\u0001\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#HÆ\u0003J\u0012\u0010±\u0001\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0003\u0010\u008e\u0001J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010ZJ\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010À\u0001\u001a\u000205HÆ\u0003J\n\u0010Á\u0001\u001a\u000205HÆ\u0003J\n\u0010Â\u0001\u001a\u000205HÆ\u0003J\n\u0010Ã\u0001\u001a\u000205HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010Ç\u0001\u001a\u000205HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010É\u0001\u001a\u000205HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010Ë\u0001\u001a\u000205HÆ\u0003J\n\u0010Ì\u0001\u001a\u000205HÆ\u0003J\u0012\u0010Í\u0001\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0003\u0010\u008e\u0001J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0005HÆ\u0003J\u0011\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010ZJ\u0011\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010ZJ\u0011\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010ZJ\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0088\u0006\u0010Ù\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u0002052\b\b\u0002\u00108\u001a\u0002052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010;\u001a\u0002052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010=\u001a\u0002052\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010?\u001a\u0002052\b\b\u0002\u0010@\u001a\u0002052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0003\u0010Ú\u0001J\u0015\u0010Û\u0001\u001a\u0002052\t\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010Þ\u0001\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u0018\u00109\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010KR \u0010/\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010K\"\u0004\bO\u0010PR \u0010.\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010K\"\u0004\bR\u0010PR\u0018\u0010,\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010KR \u00100\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010K\"\u0004\bU\u0010PR \u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010K\"\u0004\bW\u0010PR\u0018\u00102\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010KR\u001a\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010[\u001a\u0004\bY\u0010ZR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010KR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010KR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010KR\u0016\u0010@\u001a\u0002058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0018\u0010G\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010KR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010KR\u0018\u0010F\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010KR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0016\u0010;\u001a\u0002058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010`R\u0018\u0010H\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010KR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010KR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010KR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010KR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010KR\u001a\u0010D\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010[\u001a\u0004\bl\u0010ZR\u0018\u0010:\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010KR\u0018\u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010KR\u0018\u0010*\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010KR\u0018\u0010'\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010KR\u0018\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010KR\u0018\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010KR\u0016\u00104\u001a\u0002058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010`R\u0016\u00106\u001a\u0002058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010`R\u0016\u00107\u001a\u0002058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010`R\u0016\u00108\u001a\u0002058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010`R\u0018\u00103\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010KR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010KR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010KR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010KR\u0018\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010KR\u0018\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010KR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010KR\u0017\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010eR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010KR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010KR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010KR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010KR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010KR\u0019\u0010B\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010KR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010KR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010KR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010KR\u001b\u0010C\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010[\u001a\u0005\b\u008a\u0001\u0010ZR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010KR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010KR\u001d\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010<\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010KR\u0017\u0010=\u001a\u0002058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010`R\u0019\u0010>\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010KR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010KR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010KR\u0017\u0010?\u001a\u0002058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010`R\u001b\u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010[\u001a\u0005\b\u0096\u0001\u0010ZR\u001d\u0010A\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u0097\u0001\u0010\u008e\u0001¨\u0006ß\u0001"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/Order;", "", PreferencesHelper.PREF_ID, "", "orderState", "", "type", "customerState", "arrivedAt", "createdAt", "updatedAt", "redeemedAt", "redemptionCode", "etaAt", "partnerIdentifier", "partnerIdentifierForCustomer", "partnerIdentifierForCrew", "displayName", "displayDetail", "siteId", "sitePartnerId", "siteName", "sitePhone", "siteStreetAddress", "siteFullAddress", "siteLocality", "siteRegion", "siteCountry", "sitePostalCode", "siteLongitude", "siteLatitude", "siteInstructions", "siteDescription", "siteCoverPhotoURL", "siteBeaconRegions", "", "Lcom/radiusnetworks/flybuy/api/model/BeaconRegion;", "siteWrongSiteArrivalRadius", "", "projectAccentColor", "projectAccentTextColor", "projectLogoURL", "pickupWindow", "pickupType", "customerId", "customerName", "customerCarType", "customerCarColor", "customerLicensePlate", "customerRatingValue", "customerRatingComments", "pushToken", "projectMobileFlowAlwaysShowVehicleInfoFields", "", "projectMobileFlowCustomerNameEditingEnabled", "projectMobileFlowPickupTypeSelectionEnabled", "projectMobileFlowRequireVehicleInfoIfVisible", "curbsideLocalizedString", "pickupLocalizedString", "locationTrackingEnabled", "spotIdentifier", "spotIdentifierEntryEnabled", "spotIdentifierInputType", "wrongSiteDetectionEnabled", "distanceFilteringDisabled", "wrongSiteSearchRadius", "siteOperationalStatus", "sitePrearrivalSeconds", "pickupConfigId", "wrongSiteId", "handoffVehicleLocation", "estimatedReadyAt", "orderFiredAt", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArrivedAt", "()Ljava/lang/String;", "getCreatedAt", "getCurbsideLocalizedString", "getCustomerCarColor", "setCustomerCarColor", "(Ljava/lang/String;)V", "getCustomerCarType", "setCustomerCarType", "getCustomerId", "getCustomerLicensePlate", "setCustomerLicensePlate", "getCustomerName", "setCustomerName", "getCustomerRatingComments", "getCustomerRatingValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCustomerState", "getDisplayDetail", "getDisplayName", "getDistanceFilteringDisabled", "()Z", "getEstimatedReadyAt", "getEtaAt", "getHandoffVehicleLocation", "getId", "()I", "getLocationTrackingEnabled", "getOrderFiredAt", "getOrderState", "getPartnerIdentifier", "getPartnerIdentifierForCrew", "getPartnerIdentifierForCustomer", "getPickupConfigId", "getPickupLocalizedString", "getPickupType", "getPickupWindow", "getProjectAccentColor", "getProjectAccentTextColor", "getProjectLogoURL", "getProjectMobileFlowAlwaysShowVehicleInfoFields", "getProjectMobileFlowCustomerNameEditingEnabled", "getProjectMobileFlowPickupTypeSelectionEnabled", "getProjectMobileFlowRequireVehicleInfoIfVisible", "getPushToken", "getRedeemedAt", "getRedemptionCode", "getSiteBeaconRegions", "()Ljava/util/List;", "getSiteCountry", "getSiteCoverPhotoURL", "getSiteDescription", "getSiteFullAddress", "getSiteId", "getSiteInstructions", "getSiteLatitude", "getSiteLocality", "getSiteLongitude", "getSiteName", "getSiteOperationalStatus", "getSitePartnerId", "getSitePhone", "getSitePostalCode", "getSitePrearrivalSeconds", "getSiteRegion", "getSiteStreetAddress", "getSiteWrongSiteArrivalRadius", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSpotIdentifier", "getSpotIdentifierEntryEnabled", "getSpotIdentifierInputType", "getType", "getUpdatedAt", "getWrongSiteDetectionEnabled", "getWrongSiteId", "getWrongSiteSearchRadius", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/radiusnetworks/flybuy/api/model/Order;", "equals", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Order {

    @InterfaceC16127c("arrived_at")
    private final String arrivedAt;

    @InterfaceC16127c("created_at")
    private final String createdAt;

    @InterfaceC16127c("curbside_localized_string")
    private final String curbsideLocalizedString;

    @InterfaceC16127c("customer_car_color")
    private String customerCarColor;

    @InterfaceC16127c("customer_car_type")
    private String customerCarType;

    @InterfaceC16127c("customer_id")
    private final String customerId;

    @InterfaceC16127c("customer_license_plate")
    private String customerLicensePlate;

    @InterfaceC16127c("customer_name")
    private String customerName;

    @InterfaceC16127c("customer_rating_comments")
    private final String customerRatingComments;

    @InterfaceC16127c("customer_rating_value")
    private final Integer customerRatingValue;

    @InterfaceC16127c("customer_state_v2")
    private final String customerState;

    @InterfaceC16127c("display_detail")
    private final String displayDetail;

    @InterfaceC16127c("display_name")
    private final String displayName;

    @InterfaceC16127c("distance_filtering_disabled")
    private final boolean distanceFilteringDisabled;

    @InterfaceC16127c("estimated_ready_at")
    private final String estimatedReadyAt;

    @InterfaceC16127c("eta_at")
    private final String etaAt;

    @InterfaceC16127c("handoff_vehicle_location")
    private final String handoffVehicleLocation;
    private final int id;

    @InterfaceC16127c("location_tracking_enabled")
    private final boolean locationTrackingEnabled;

    @InterfaceC16127c("order_fired_at")
    private final String orderFiredAt;

    @InterfaceC16127c("state_v2")
    private final String orderState;

    @InterfaceC16127c("partner_identifier")
    private final String partnerIdentifier;

    @InterfaceC16127c("partner_identifier_for_crew")
    private final String partnerIdentifierForCrew;

    @InterfaceC16127c("partner_identifier_for_customer")
    private final String partnerIdentifierForCustomer;

    @InterfaceC16127c("pickup_config_id")
    private final Integer pickupConfigId;

    @InterfaceC16127c("pickup_localized_string")
    private final String pickupLocalizedString;

    @InterfaceC16127c("pickup_type")
    private final String pickupType;

    @InterfaceC16127c("pickup_window")
    private final String pickupWindow;

    @InterfaceC16127c("project_accent_color")
    private final String projectAccentColor;

    @InterfaceC16127c("project_accent_text_color")
    private final String projectAccentTextColor;

    @InterfaceC16127c("project_logo_url")
    private final String projectLogoURL;

    @InterfaceC16127c("project_mobile_flow_always_show_vehicle_info_fields")
    private final boolean projectMobileFlowAlwaysShowVehicleInfoFields;

    @InterfaceC16127c("project_mobile_flow_customer_name_editing_enabled")
    private final boolean projectMobileFlowCustomerNameEditingEnabled;

    @InterfaceC16127c("project_mobile_flow_pickup_type_selection_enabled")
    private final boolean projectMobileFlowPickupTypeSelectionEnabled;

    @InterfaceC16127c("project_mobile_flow_require_vehicle_info_if_visible")
    private final boolean projectMobileFlowRequireVehicleInfoIfVisible;

    @InterfaceC16127c("push_token")
    private final String pushToken;

    @InterfaceC16127c("redeemed_at")
    private final String redeemedAt;

    @InterfaceC16127c("redemption_code")
    private final String redemptionCode;

    @InterfaceC16127c("site_beacon_regions")
    private final List<BeaconRegion> siteBeaconRegions;

    @InterfaceC16127c("site_country")
    private final String siteCountry;

    @InterfaceC16127c("site_cover_photo_url")
    private final String siteCoverPhotoURL;

    @InterfaceC16127c("site_description")
    private final String siteDescription;

    @InterfaceC16127c("site_full_address")
    private final String siteFullAddress;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_SITE_ID)
    private final int siteId;

    @InterfaceC16127c("site_instructions")
    private final String siteInstructions;

    @InterfaceC16127c("site_latitude")
    private final String siteLatitude;

    @InterfaceC16127c("site_locality")
    private final String siteLocality;

    @InterfaceC16127c("site_longitude")
    private final String siteLongitude;

    @InterfaceC16127c("site_name")
    private final String siteName;

    @InterfaceC16127c("site_operational_status")
    private final String siteOperationalStatus;

    @InterfaceC16127c("site_partner_identifier")
    private final String sitePartnerId;

    @InterfaceC16127c("site_phone")
    private final String sitePhone;

    @InterfaceC16127c("site_postal_code")
    private final String sitePostalCode;

    @InterfaceC16127c("site_prearrival_seconds")
    private final Integer sitePrearrivalSeconds;

    @InterfaceC16127c("site_region")
    private final String siteRegion;

    @InterfaceC16127c("site_street_address")
    private final String siteStreetAddress;

    @InterfaceC16127c("site_wrong_site_arrival_radius")
    private final Double siteWrongSiteArrivalRadius;

    @InterfaceC16127c("spot_identifier")
    private final String spotIdentifier;

    @InterfaceC16127c("spot_identifier_entry_enabled")
    private final boolean spotIdentifierEntryEnabled;

    @InterfaceC16127c("spot_identifier_input_type")
    private final String spotIdentifierInputType;
    private final String type;

    @InterfaceC16127c("updated_at")
    private final String updatedAt;

    @InterfaceC16127c("wrong_site_detection_enabled")
    private final boolean wrongSiteDetectionEnabled;

    @InterfaceC16127c("wrong_site_id")
    private final Integer wrongSiteId;

    @InterfaceC16127c("wrong_site_search_radius")
    private final Double wrongSiteSearchRadius;

    public Order(int i10, String orderState, String str, String customerState, String str2, String createdAt, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, List<BeaconRegion> list, Double d10, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, Integer num, String str36, String str37, boolean z10, boolean z11, boolean z12, boolean z13, String str38, String str39, boolean z14, String str40, boolean z15, String str41, boolean z16, boolean z17, Double d11, String str42, Integer num2, Integer num3, Integer num4, String str43, String str44, String str45) {
        Intrinsics.j(orderState, "orderState");
        Intrinsics.j(customerState, "customerState");
        Intrinsics.j(createdAt, "createdAt");
        this.id = i10;
        this.orderState = orderState;
        this.type = str;
        this.customerState = customerState;
        this.arrivedAt = str2;
        this.createdAt = createdAt;
        this.updatedAt = str3;
        this.redeemedAt = str4;
        this.redemptionCode = str5;
        this.etaAt = str6;
        this.partnerIdentifier = str7;
        this.partnerIdentifierForCustomer = str8;
        this.partnerIdentifierForCrew = str9;
        this.displayName = str10;
        this.displayDetail = str11;
        this.siteId = i11;
        this.sitePartnerId = str12;
        this.siteName = str13;
        this.sitePhone = str14;
        this.siteStreetAddress = str15;
        this.siteFullAddress = str16;
        this.siteLocality = str17;
        this.siteRegion = str18;
        this.siteCountry = str19;
        this.sitePostalCode = str20;
        this.siteLongitude = str21;
        this.siteLatitude = str22;
        this.siteInstructions = str23;
        this.siteDescription = str24;
        this.siteCoverPhotoURL = str25;
        this.siteBeaconRegions = list;
        this.siteWrongSiteArrivalRadius = d10;
        this.projectAccentColor = str26;
        this.projectAccentTextColor = str27;
        this.projectLogoURL = str28;
        this.pickupWindow = str29;
        this.pickupType = str30;
        this.customerId = str31;
        this.customerName = str32;
        this.customerCarType = str33;
        this.customerCarColor = str34;
        this.customerLicensePlate = str35;
        this.customerRatingValue = num;
        this.customerRatingComments = str36;
        this.pushToken = str37;
        this.projectMobileFlowAlwaysShowVehicleInfoFields = z10;
        this.projectMobileFlowCustomerNameEditingEnabled = z11;
        this.projectMobileFlowPickupTypeSelectionEnabled = z12;
        this.projectMobileFlowRequireVehicleInfoIfVisible = z13;
        this.curbsideLocalizedString = str38;
        this.pickupLocalizedString = str39;
        this.locationTrackingEnabled = z14;
        this.spotIdentifier = str40;
        this.spotIdentifierEntryEnabled = z15;
        this.spotIdentifierInputType = str41;
        this.wrongSiteDetectionEnabled = z16;
        this.distanceFilteringDisabled = z17;
        this.wrongSiteSearchRadius = d11;
        this.siteOperationalStatus = str42;
        this.sitePrearrivalSeconds = num2;
        this.pickupConfigId = num3;
        this.wrongSiteId = num4;
        this.handoffVehicleLocation = str43;
        this.estimatedReadyAt = str44;
        this.orderFiredAt = str45;
    }

    public static /* synthetic */ Order copy$default(Order order, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i11, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, List list, Double d10, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, Integer num, String str39, String str40, boolean z10, boolean z11, boolean z12, boolean z13, String str41, String str42, boolean z14, String str43, boolean z15, String str44, boolean z16, boolean z17, Double d11, String str45, Integer num2, Integer num3, Integer num4, String str46, String str47, String str48, int i12, int i13, int i14, Object obj) {
        String str49;
        String str50;
        boolean z18;
        String str51;
        String str52;
        boolean z19;
        String str53;
        boolean z20;
        String str54;
        boolean z21;
        boolean z22;
        Double d12;
        String str55;
        Integer num5;
        Integer num6;
        Integer num7;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60;
        String str61;
        String str62;
        String str63;
        String str64;
        Integer num8;
        String str65;
        String str66;
        boolean z23;
        boolean z24;
        boolean z25;
        String str67;
        String str68;
        String str69;
        String str70;
        String str71;
        String str72;
        String str73;
        String str74;
        String str75;
        String str76;
        List list2;
        Double d13;
        String str77;
        String str78;
        String str79;
        String str80;
        String str81;
        String str82;
        String str83;
        String str84;
        String str85;
        String str86;
        String str87;
        int i15;
        String str88;
        String str89;
        String str90;
        String str91;
        String str92;
        String str93;
        String str94;
        String str95;
        String str96;
        int i16 = (i12 & 1) != 0 ? order.id : i10;
        String str97 = (i12 & 2) != 0 ? order.orderState : str;
        String str98 = (i12 & 4) != 0 ? order.type : str2;
        String str99 = (i12 & 8) != 0 ? order.customerState : str3;
        String str100 = (i12 & 16) != 0 ? order.arrivedAt : str4;
        String str101 = (i12 & 32) != 0 ? order.createdAt : str5;
        String str102 = (i12 & 64) != 0 ? order.updatedAt : str6;
        String str103 = (i12 & 128) != 0 ? order.redeemedAt : str7;
        String str104 = (i12 & 256) != 0 ? order.redemptionCode : str8;
        String str105 = (i12 & 512) != 0 ? order.etaAt : str9;
        String str106 = (i12 & 1024) != 0 ? order.partnerIdentifier : str10;
        String str107 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? order.partnerIdentifierForCustomer : str11;
        String str108 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? order.partnerIdentifierForCrew : str12;
        int i17 = i16;
        String str109 = (i12 & 8192) != 0 ? order.displayName : str13;
        String str110 = (i12 & 16384) != 0 ? order.displayDetail : str14;
        int i18 = (i12 & 32768) != 0 ? order.siteId : i11;
        String str111 = (i12 & 65536) != 0 ? order.sitePartnerId : str15;
        String str112 = (i12 & 131072) != 0 ? order.siteName : str16;
        String str113 = (i12 & 262144) != 0 ? order.sitePhone : str17;
        String str114 = (i12 & 524288) != 0 ? order.siteStreetAddress : str18;
        String str115 = (i12 & 1048576) != 0 ? order.siteFullAddress : str19;
        String str116 = (i12 & 2097152) != 0 ? order.siteLocality : str20;
        String str117 = (i12 & 4194304) != 0 ? order.siteRegion : str21;
        String str118 = (i12 & 8388608) != 0 ? order.siteCountry : str22;
        String str119 = (i12 & 16777216) != 0 ? order.sitePostalCode : str23;
        String str120 = (i12 & 33554432) != 0 ? order.siteLongitude : str24;
        String str121 = (i12 & 67108864) != 0 ? order.siteLatitude : str25;
        String str122 = (i12 & 134217728) != 0 ? order.siteInstructions : str26;
        String str123 = (i12 & 268435456) != 0 ? order.siteDescription : str27;
        String str124 = (i12 & 536870912) != 0 ? order.siteCoverPhotoURL : str28;
        List list3 = (i12 & 1073741824) != 0 ? order.siteBeaconRegions : list;
        Double d14 = (i12 & Integer.MIN_VALUE) != 0 ? order.siteWrongSiteArrivalRadius : d10;
        String str125 = (i13 & 1) != 0 ? order.projectAccentColor : str29;
        String str126 = (i13 & 2) != 0 ? order.projectAccentTextColor : str30;
        String str127 = (i13 & 4) != 0 ? order.projectLogoURL : str31;
        String str128 = (i13 & 8) != 0 ? order.pickupWindow : str32;
        String str129 = (i13 & 16) != 0 ? order.pickupType : str33;
        String str130 = (i13 & 32) != 0 ? order.customerId : str34;
        String str131 = (i13 & 64) != 0 ? order.customerName : str35;
        String str132 = (i13 & 128) != 0 ? order.customerCarType : str36;
        String str133 = (i13 & 256) != 0 ? order.customerCarColor : str37;
        String str134 = (i13 & 512) != 0 ? order.customerLicensePlate : str38;
        Integer num9 = (i13 & 1024) != 0 ? order.customerRatingValue : num;
        String str135 = (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? order.customerRatingComments : str39;
        String str136 = (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? order.pushToken : str40;
        boolean z26 = (i13 & 8192) != 0 ? order.projectMobileFlowAlwaysShowVehicleInfoFields : z10;
        boolean z27 = (i13 & 16384) != 0 ? order.projectMobileFlowCustomerNameEditingEnabled : z11;
        boolean z28 = (i13 & 32768) != 0 ? order.projectMobileFlowPickupTypeSelectionEnabled : z12;
        boolean z29 = (i13 & 65536) != 0 ? order.projectMobileFlowRequireVehicleInfoIfVisible : z13;
        String str137 = (i13 & 131072) != 0 ? order.curbsideLocalizedString : str41;
        String str138 = (i13 & 262144) != 0 ? order.pickupLocalizedString : str42;
        boolean z30 = (i13 & 524288) != 0 ? order.locationTrackingEnabled : z14;
        String str139 = (i13 & 1048576) != 0 ? order.spotIdentifier : str43;
        boolean z31 = (i13 & 2097152) != 0 ? order.spotIdentifierEntryEnabled : z15;
        String str140 = (i13 & 4194304) != 0 ? order.spotIdentifierInputType : str44;
        boolean z32 = (i13 & 8388608) != 0 ? order.wrongSiteDetectionEnabled : z16;
        boolean z33 = (i13 & 16777216) != 0 ? order.distanceFilteringDisabled : z17;
        Double d15 = (i13 & 33554432) != 0 ? order.wrongSiteSearchRadius : d11;
        String str141 = (i13 & 67108864) != 0 ? order.siteOperationalStatus : str45;
        Integer num10 = (i13 & 134217728) != 0 ? order.sitePrearrivalSeconds : num2;
        Integer num11 = (i13 & 268435456) != 0 ? order.pickupConfigId : num3;
        Integer num12 = (i13 & 536870912) != 0 ? order.wrongSiteId : num4;
        String str142 = (i13 & 1073741824) != 0 ? order.handoffVehicleLocation : str46;
        String str143 = (i13 & Integer.MIN_VALUE) != 0 ? order.estimatedReadyAt : str47;
        if ((i14 & 1) != 0) {
            str50 = str142;
            str49 = order.orderFiredAt;
            str51 = str137;
            str52 = str138;
            z19 = z30;
            str53 = str139;
            z20 = z31;
            str54 = str140;
            z21 = z32;
            z22 = z33;
            d12 = d15;
            str55 = str141;
            num5 = num10;
            num6 = num11;
            num7 = num12;
            str56 = str143;
            str58 = str128;
            str59 = str129;
            str60 = str130;
            str61 = str131;
            str62 = str132;
            str63 = str133;
            str64 = str134;
            num8 = num9;
            str65 = str135;
            str66 = str136;
            z23 = z26;
            z24 = z27;
            z25 = z28;
            z18 = z29;
            str68 = str116;
            str69 = str117;
            str70 = str118;
            str71 = str119;
            str72 = str120;
            str73 = str121;
            str74 = str122;
            str75 = str123;
            str76 = str124;
            list2 = list3;
            d13 = d14;
            str77 = str125;
            str78 = str126;
            str57 = str127;
            str79 = str110;
            str81 = str103;
            str82 = str104;
            str83 = str105;
            str84 = str106;
            str85 = str107;
            str86 = str108;
            str87 = str109;
            i15 = i18;
            str88 = str111;
            str89 = str112;
            str90 = str113;
            str91 = str114;
            str67 = str115;
            str92 = str97;
            str93 = str98;
            str94 = str99;
            str95 = str100;
            str96 = str101;
            str80 = str102;
        } else {
            str49 = str48;
            str50 = str142;
            z18 = z29;
            str51 = str137;
            str52 = str138;
            z19 = z30;
            str53 = str139;
            z20 = z31;
            str54 = str140;
            z21 = z32;
            z22 = z33;
            d12 = d15;
            str55 = str141;
            num5 = num10;
            num6 = num11;
            num7 = num12;
            str56 = str143;
            str57 = str127;
            str58 = str128;
            str59 = str129;
            str60 = str130;
            str61 = str131;
            str62 = str132;
            str63 = str133;
            str64 = str134;
            num8 = num9;
            str65 = str135;
            str66 = str136;
            z23 = z26;
            z24 = z27;
            z25 = z28;
            str67 = str115;
            str68 = str116;
            str69 = str117;
            str70 = str118;
            str71 = str119;
            str72 = str120;
            str73 = str121;
            str74 = str122;
            str75 = str123;
            str76 = str124;
            list2 = list3;
            d13 = d14;
            str77 = str125;
            str78 = str126;
            str79 = str110;
            str80 = str102;
            str81 = str103;
            str82 = str104;
            str83 = str105;
            str84 = str106;
            str85 = str107;
            str86 = str108;
            str87 = str109;
            i15 = i18;
            str88 = str111;
            str89 = str112;
            str90 = str113;
            str91 = str114;
            str92 = str97;
            str93 = str98;
            str94 = str99;
            str95 = str100;
            str96 = str101;
        }
        return order.copy(i17, str92, str93, str94, str95, str96, str80, str81, str82, str83, str84, str85, str86, str87, str79, i15, str88, str89, str90, str91, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, list2, d13, str77, str78, str57, str58, str59, str60, str61, str62, str63, str64, num8, str65, str66, z23, z24, z25, z18, str51, str52, z19, str53, z20, str54, z21, z22, d12, str55, num5, num6, num7, str50, str56, str49);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getEtaAt() {
        return this.etaAt;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPartnerIdentifierForCustomer() {
        return this.partnerIdentifierForCustomer;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPartnerIdentifierForCrew() {
        return this.partnerIdentifierForCrew;
    }

    /* renamed from: component14, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component15, reason: from getter */
    public final String getDisplayDetail() {
        return this.displayDetail;
    }

    /* renamed from: component16, reason: from getter */
    public final int getSiteId() {
        return this.siteId;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSitePartnerId() {
        return this.sitePartnerId;
    }

    /* renamed from: component18, reason: from getter */
    public final String getSiteName() {
        return this.siteName;
    }

    /* renamed from: component19, reason: from getter */
    public final String getSitePhone() {
        return this.sitePhone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderState() {
        return this.orderState;
    }

    /* renamed from: component20, reason: from getter */
    public final String getSiteStreetAddress() {
        return this.siteStreetAddress;
    }

    /* renamed from: component21, reason: from getter */
    public final String getSiteFullAddress() {
        return this.siteFullAddress;
    }

    /* renamed from: component22, reason: from getter */
    public final String getSiteLocality() {
        return this.siteLocality;
    }

    /* renamed from: component23, reason: from getter */
    public final String getSiteRegion() {
        return this.siteRegion;
    }

    /* renamed from: component24, reason: from getter */
    public final String getSiteCountry() {
        return this.siteCountry;
    }

    /* renamed from: component25, reason: from getter */
    public final String getSitePostalCode() {
        return this.sitePostalCode;
    }

    /* renamed from: component26, reason: from getter */
    public final String getSiteLongitude() {
        return this.siteLongitude;
    }

    /* renamed from: component27, reason: from getter */
    public final String getSiteLatitude() {
        return this.siteLatitude;
    }

    /* renamed from: component28, reason: from getter */
    public final String getSiteInstructions() {
        return this.siteInstructions;
    }

    /* renamed from: component29, reason: from getter */
    public final String getSiteDescription() {
        return this.siteDescription;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component30, reason: from getter */
    public final String getSiteCoverPhotoURL() {
        return this.siteCoverPhotoURL;
    }

    public final List<BeaconRegion> component31() {
        return this.siteBeaconRegions;
    }

    /* renamed from: component32, reason: from getter */
    public final Double getSiteWrongSiteArrivalRadius() {
        return this.siteWrongSiteArrivalRadius;
    }

    /* renamed from: component33, reason: from getter */
    public final String getProjectAccentColor() {
        return this.projectAccentColor;
    }

    /* renamed from: component34, reason: from getter */
    public final String getProjectAccentTextColor() {
        return this.projectAccentTextColor;
    }

    /* renamed from: component35, reason: from getter */
    public final String getProjectLogoURL() {
        return this.projectLogoURL;
    }

    /* renamed from: component36, reason: from getter */
    public final String getPickupWindow() {
        return this.pickupWindow;
    }

    /* renamed from: component37, reason: from getter */
    public final String getPickupType() {
        return this.pickupType;
    }

    /* renamed from: component38, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component39, reason: from getter */
    public final String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCustomerState() {
        return this.customerState;
    }

    /* renamed from: component40, reason: from getter */
    public final String getCustomerCarType() {
        return this.customerCarType;
    }

    /* renamed from: component41, reason: from getter */
    public final String getCustomerCarColor() {
        return this.customerCarColor;
    }

    /* renamed from: component42, reason: from getter */
    public final String getCustomerLicensePlate() {
        return this.customerLicensePlate;
    }

    /* renamed from: component43, reason: from getter */
    public final Integer getCustomerRatingValue() {
        return this.customerRatingValue;
    }

    /* renamed from: component44, reason: from getter */
    public final String getCustomerRatingComments() {
        return this.customerRatingComments;
    }

    /* renamed from: component45, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    /* renamed from: component46, reason: from getter */
    public final boolean getProjectMobileFlowAlwaysShowVehicleInfoFields() {
        return this.projectMobileFlowAlwaysShowVehicleInfoFields;
    }

    /* renamed from: component47, reason: from getter */
    public final boolean getProjectMobileFlowCustomerNameEditingEnabled() {
        return this.projectMobileFlowCustomerNameEditingEnabled;
    }

    /* renamed from: component48, reason: from getter */
    public final boolean getProjectMobileFlowPickupTypeSelectionEnabled() {
        return this.projectMobileFlowPickupTypeSelectionEnabled;
    }

    /* renamed from: component49, reason: from getter */
    public final boolean getProjectMobileFlowRequireVehicleInfoIfVisible() {
        return this.projectMobileFlowRequireVehicleInfoIfVisible;
    }

    /* renamed from: component5, reason: from getter */
    public final String getArrivedAt() {
        return this.arrivedAt;
    }

    /* renamed from: component50, reason: from getter */
    public final String getCurbsideLocalizedString() {
        return this.curbsideLocalizedString;
    }

    /* renamed from: component51, reason: from getter */
    public final String getPickupLocalizedString() {
        return this.pickupLocalizedString;
    }

    /* renamed from: component52, reason: from getter */
    public final boolean getLocationTrackingEnabled() {
        return this.locationTrackingEnabled;
    }

    /* renamed from: component53, reason: from getter */
    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    /* renamed from: component54, reason: from getter */
    public final boolean getSpotIdentifierEntryEnabled() {
        return this.spotIdentifierEntryEnabled;
    }

    /* renamed from: component55, reason: from getter */
    public final String getSpotIdentifierInputType() {
        return this.spotIdentifierInputType;
    }

    /* renamed from: component56, reason: from getter */
    public final boolean getWrongSiteDetectionEnabled() {
        return this.wrongSiteDetectionEnabled;
    }

    /* renamed from: component57, reason: from getter */
    public final boolean getDistanceFilteringDisabled() {
        return this.distanceFilteringDisabled;
    }

    /* renamed from: component58, reason: from getter */
    public final Double getWrongSiteSearchRadius() {
        return this.wrongSiteSearchRadius;
    }

    /* renamed from: component59, reason: from getter */
    public final String getSiteOperationalStatus() {
        return this.siteOperationalStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component60, reason: from getter */
    public final Integer getSitePrearrivalSeconds() {
        return this.sitePrearrivalSeconds;
    }

    /* renamed from: component61, reason: from getter */
    public final Integer getPickupConfigId() {
        return this.pickupConfigId;
    }

    /* renamed from: component62, reason: from getter */
    public final Integer getWrongSiteId() {
        return this.wrongSiteId;
    }

    /* renamed from: component63, reason: from getter */
    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    /* renamed from: component64, reason: from getter */
    public final String getEstimatedReadyAt() {
        return this.estimatedReadyAt;
    }

    /* renamed from: component65, reason: from getter */
    public final String getOrderFiredAt() {
        return this.orderFiredAt;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRedeemedAt() {
        return this.redeemedAt;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRedemptionCode() {
        return this.redemptionCode;
    }

    public final Order copy(int id2, String orderState, String type, String customerState, String arrivedAt, String createdAt, String updatedAt, String redeemedAt, String redemptionCode, String etaAt, String partnerIdentifier, String partnerIdentifierForCustomer, String partnerIdentifierForCrew, String displayName, String displayDetail, int siteId, String sitePartnerId, String siteName, String sitePhone, String siteStreetAddress, String siteFullAddress, String siteLocality, String siteRegion, String siteCountry, String sitePostalCode, String siteLongitude, String siteLatitude, String siteInstructions, String siteDescription, String siteCoverPhotoURL, List<BeaconRegion> siteBeaconRegions, Double siteWrongSiteArrivalRadius, String projectAccentColor, String projectAccentTextColor, String projectLogoURL, String pickupWindow, String pickupType, String customerId, String customerName, String customerCarType, String customerCarColor, String customerLicensePlate, Integer customerRatingValue, String customerRatingComments, String pushToken, boolean projectMobileFlowAlwaysShowVehicleInfoFields, boolean projectMobileFlowCustomerNameEditingEnabled, boolean projectMobileFlowPickupTypeSelectionEnabled, boolean projectMobileFlowRequireVehicleInfoIfVisible, String curbsideLocalizedString, String pickupLocalizedString, boolean locationTrackingEnabled, String spotIdentifier, boolean spotIdentifierEntryEnabled, String spotIdentifierInputType, boolean wrongSiteDetectionEnabled, boolean distanceFilteringDisabled, Double wrongSiteSearchRadius, String siteOperationalStatus, Integer sitePrearrivalSeconds, Integer pickupConfigId, Integer wrongSiteId, String handoffVehicleLocation, String estimatedReadyAt, String orderFiredAt) {
        Intrinsics.j(orderState, "orderState");
        Intrinsics.j(customerState, "customerState");
        Intrinsics.j(createdAt, "createdAt");
        return new Order(id2, orderState, type, customerState, arrivedAt, createdAt, updatedAt, redeemedAt, redemptionCode, etaAt, partnerIdentifier, partnerIdentifierForCustomer, partnerIdentifierForCrew, displayName, displayDetail, siteId, sitePartnerId, siteName, sitePhone, siteStreetAddress, siteFullAddress, siteLocality, siteRegion, siteCountry, sitePostalCode, siteLongitude, siteLatitude, siteInstructions, siteDescription, siteCoverPhotoURL, siteBeaconRegions, siteWrongSiteArrivalRadius, projectAccentColor, projectAccentTextColor, projectLogoURL, pickupWindow, pickupType, customerId, customerName, customerCarType, customerCarColor, customerLicensePlate, customerRatingValue, customerRatingComments, pushToken, projectMobileFlowAlwaysShowVehicleInfoFields, projectMobileFlowCustomerNameEditingEnabled, projectMobileFlowPickupTypeSelectionEnabled, projectMobileFlowRequireVehicleInfoIfVisible, curbsideLocalizedString, pickupLocalizedString, locationTrackingEnabled, spotIdentifier, spotIdentifierEntryEnabled, spotIdentifierInputType, wrongSiteDetectionEnabled, distanceFilteringDisabled, wrongSiteSearchRadius, siteOperationalStatus, sitePrearrivalSeconds, pickupConfigId, wrongSiteId, handoffVehicleLocation, estimatedReadyAt, orderFiredAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order order = (Order) other;
        return this.id == order.id && Intrinsics.e(this.orderState, order.orderState) && Intrinsics.e(this.type, order.type) && Intrinsics.e(this.customerState, order.customerState) && Intrinsics.e(this.arrivedAt, order.arrivedAt) && Intrinsics.e(this.createdAt, order.createdAt) && Intrinsics.e(this.updatedAt, order.updatedAt) && Intrinsics.e(this.redeemedAt, order.redeemedAt) && Intrinsics.e(this.redemptionCode, order.redemptionCode) && Intrinsics.e(this.etaAt, order.etaAt) && Intrinsics.e(this.partnerIdentifier, order.partnerIdentifier) && Intrinsics.e(this.partnerIdentifierForCustomer, order.partnerIdentifierForCustomer) && Intrinsics.e(this.partnerIdentifierForCrew, order.partnerIdentifierForCrew) && Intrinsics.e(this.displayName, order.displayName) && Intrinsics.e(this.displayDetail, order.displayDetail) && this.siteId == order.siteId && Intrinsics.e(this.sitePartnerId, order.sitePartnerId) && Intrinsics.e(this.siteName, order.siteName) && Intrinsics.e(this.sitePhone, order.sitePhone) && Intrinsics.e(this.siteStreetAddress, order.siteStreetAddress) && Intrinsics.e(this.siteFullAddress, order.siteFullAddress) && Intrinsics.e(this.siteLocality, order.siteLocality) && Intrinsics.e(this.siteRegion, order.siteRegion) && Intrinsics.e(this.siteCountry, order.siteCountry) && Intrinsics.e(this.sitePostalCode, order.sitePostalCode) && Intrinsics.e(this.siteLongitude, order.siteLongitude) && Intrinsics.e(this.siteLatitude, order.siteLatitude) && Intrinsics.e(this.siteInstructions, order.siteInstructions) && Intrinsics.e(this.siteDescription, order.siteDescription) && Intrinsics.e(this.siteCoverPhotoURL, order.siteCoverPhotoURL) && Intrinsics.e(this.siteBeaconRegions, order.siteBeaconRegions) && Intrinsics.e(this.siteWrongSiteArrivalRadius, order.siteWrongSiteArrivalRadius) && Intrinsics.e(this.projectAccentColor, order.projectAccentColor) && Intrinsics.e(this.projectAccentTextColor, order.projectAccentTextColor) && Intrinsics.e(this.projectLogoURL, order.projectLogoURL) && Intrinsics.e(this.pickupWindow, order.pickupWindow) && Intrinsics.e(this.pickupType, order.pickupType) && Intrinsics.e(this.customerId, order.customerId) && Intrinsics.e(this.customerName, order.customerName) && Intrinsics.e(this.customerCarType, order.customerCarType) && Intrinsics.e(this.customerCarColor, order.customerCarColor) && Intrinsics.e(this.customerLicensePlate, order.customerLicensePlate) && Intrinsics.e(this.customerRatingValue, order.customerRatingValue) && Intrinsics.e(this.customerRatingComments, order.customerRatingComments) && Intrinsics.e(this.pushToken, order.pushToken) && this.projectMobileFlowAlwaysShowVehicleInfoFields == order.projectMobileFlowAlwaysShowVehicleInfoFields && this.projectMobileFlowCustomerNameEditingEnabled == order.projectMobileFlowCustomerNameEditingEnabled && this.projectMobileFlowPickupTypeSelectionEnabled == order.projectMobileFlowPickupTypeSelectionEnabled && this.projectMobileFlowRequireVehicleInfoIfVisible == order.projectMobileFlowRequireVehicleInfoIfVisible && Intrinsics.e(this.curbsideLocalizedString, order.curbsideLocalizedString) && Intrinsics.e(this.pickupLocalizedString, order.pickupLocalizedString) && this.locationTrackingEnabled == order.locationTrackingEnabled && Intrinsics.e(this.spotIdentifier, order.spotIdentifier) && this.spotIdentifierEntryEnabled == order.spotIdentifierEntryEnabled && Intrinsics.e(this.spotIdentifierInputType, order.spotIdentifierInputType) && this.wrongSiteDetectionEnabled == order.wrongSiteDetectionEnabled && this.distanceFilteringDisabled == order.distanceFilteringDisabled && Intrinsics.e(this.wrongSiteSearchRadius, order.wrongSiteSearchRadius) && Intrinsics.e(this.siteOperationalStatus, order.siteOperationalStatus) && Intrinsics.e(this.sitePrearrivalSeconds, order.sitePrearrivalSeconds) && Intrinsics.e(this.pickupConfigId, order.pickupConfigId) && Intrinsics.e(this.wrongSiteId, order.wrongSiteId) && Intrinsics.e(this.handoffVehicleLocation, order.handoffVehicleLocation) && Intrinsics.e(this.estimatedReadyAt, order.estimatedReadyAt) && Intrinsics.e(this.orderFiredAt, order.orderFiredAt);
    }

    public String toString() {
        return "Order(id=" + this.id + ", orderState=" + this.orderState + ", type=" + this.type + ", customerState=" + this.customerState + ", arrivedAt=" + this.arrivedAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", redeemedAt=" + this.redeemedAt + ", redemptionCode=" + this.redemptionCode + ", etaAt=" + this.etaAt + ", partnerIdentifier=" + this.partnerIdentifier + ", partnerIdentifierForCustomer=" + this.partnerIdentifierForCustomer + ", partnerIdentifierForCrew=" + this.partnerIdentifierForCrew + ", displayName=" + this.displayName + ", displayDetail=" + this.displayDetail + ", siteId=" + this.siteId + ", sitePartnerId=" + this.sitePartnerId + ", siteName=" + this.siteName + ", sitePhone=" + this.sitePhone + ", siteStreetAddress=" + this.siteStreetAddress + ", siteFullAddress=" + this.siteFullAddress + ", siteLocality=" + this.siteLocality + ", siteRegion=" + this.siteRegion + ", siteCountry=" + this.siteCountry + ", sitePostalCode=" + this.sitePostalCode + ", siteLongitude=" + this.siteLongitude + ", siteLatitude=" + this.siteLatitude + ", siteInstructions=" + this.siteInstructions + ", siteDescription=" + this.siteDescription + ", siteCoverPhotoURL=" + this.siteCoverPhotoURL + ", siteBeaconRegions=" + this.siteBeaconRegions + ", siteWrongSiteArrivalRadius=" + this.siteWrongSiteArrivalRadius + ", projectAccentColor=" + this.projectAccentColor + ", projectAccentTextColor=" + this.projectAccentTextColor + ", projectLogoURL=" + this.projectLogoURL + ", pickupWindow=" + this.pickupWindow + ", pickupType=" + this.pickupType + ", customerId=" + this.customerId + ", customerName=" + this.customerName + ", customerCarType=" + this.customerCarType + ", customerCarColor=" + this.customerCarColor + ", customerLicensePlate=" + this.customerLicensePlate + ", customerRatingValue=" + this.customerRatingValue + ", customerRatingComments=" + this.customerRatingComments + ", pushToken=" + this.pushToken + ", projectMobileFlowAlwaysShowVehicleInfoFields=" + this.projectMobileFlowAlwaysShowVehicleInfoFields + ", projectMobileFlowCustomerNameEditingEnabled=" + this.projectMobileFlowCustomerNameEditingEnabled + ", projectMobileFlowPickupTypeSelectionEnabled=" + this.projectMobileFlowPickupTypeSelectionEnabled + ", projectMobileFlowRequireVehicleInfoIfVisible=" + this.projectMobileFlowRequireVehicleInfoIfVisible + ", curbsideLocalizedString=" + this.curbsideLocalizedString + ", pickupLocalizedString=" + this.pickupLocalizedString + ", locationTrackingEnabled=" + this.locationTrackingEnabled + ", spotIdentifier=" + this.spotIdentifier + ", spotIdentifierEntryEnabled=" + this.spotIdentifierEntryEnabled + ", spotIdentifierInputType=" + this.spotIdentifierInputType + ", wrongSiteDetectionEnabled=" + this.wrongSiteDetectionEnabled + ", distanceFilteringDisabled=" + this.distanceFilteringDisabled + ", wrongSiteSearchRadius=" + this.wrongSiteSearchRadius + ", siteOperationalStatus=" + this.siteOperationalStatus + ", sitePrearrivalSeconds=" + this.sitePrearrivalSeconds + ", pickupConfigId=" + this.pickupConfigId + ", wrongSiteId=" + this.wrongSiteId + ", handoffVehicleLocation=" + this.handoffVehicleLocation + ", estimatedReadyAt=" + this.estimatedReadyAt + ", orderFiredAt=" + this.orderFiredAt + ')';
    }

    public final String getArrivedAt() {
        return this.arrivedAt;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurbsideLocalizedString() {
        return this.curbsideLocalizedString;
    }

    public final String getCustomerCarColor() {
        return this.customerCarColor;
    }

    public final String getCustomerCarType() {
        return this.customerCarType;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getCustomerLicensePlate() {
        return this.customerLicensePlate;
    }

    public final String getCustomerName() {
        return this.customerName;
    }

    public final String getCustomerRatingComments() {
        return this.customerRatingComments;
    }

    public final Integer getCustomerRatingValue() {
        return this.customerRatingValue;
    }

    public final String getCustomerState() {
        return this.customerState;
    }

    public final String getDisplayDetail() {
        return this.displayDetail;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getDistanceFilteringDisabled() {
        return this.distanceFilteringDisabled;
    }

    public final String getEstimatedReadyAt() {
        return this.estimatedReadyAt;
    }

    public final String getEtaAt() {
        return this.etaAt;
    }

    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getLocationTrackingEnabled() {
        return this.locationTrackingEnabled;
    }

    public final String getOrderFiredAt() {
        return this.orderFiredAt;
    }

    public final String getOrderState() {
        return this.orderState;
    }

    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    public final String getPartnerIdentifierForCrew() {
        return this.partnerIdentifierForCrew;
    }

    public final String getPartnerIdentifierForCustomer() {
        return this.partnerIdentifierForCustomer;
    }

    public final Integer getPickupConfigId() {
        return this.pickupConfigId;
    }

    public final String getPickupLocalizedString() {
        return this.pickupLocalizedString;
    }

    public final String getPickupType() {
        return this.pickupType;
    }

    public final String getPickupWindow() {
        return this.pickupWindow;
    }

    public final String getProjectAccentColor() {
        return this.projectAccentColor;
    }

    public final String getProjectAccentTextColor() {
        return this.projectAccentTextColor;
    }

    public final String getProjectLogoURL() {
        return this.projectLogoURL;
    }

    public final boolean getProjectMobileFlowAlwaysShowVehicleInfoFields() {
        return this.projectMobileFlowAlwaysShowVehicleInfoFields;
    }

    public final boolean getProjectMobileFlowCustomerNameEditingEnabled() {
        return this.projectMobileFlowCustomerNameEditingEnabled;
    }

    public final boolean getProjectMobileFlowPickupTypeSelectionEnabled() {
        return this.projectMobileFlowPickupTypeSelectionEnabled;
    }

    public final boolean getProjectMobileFlowRequireVehicleInfoIfVisible() {
        return this.projectMobileFlowRequireVehicleInfoIfVisible;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final String getRedeemedAt() {
        return this.redeemedAt;
    }

    public final String getRedemptionCode() {
        return this.redemptionCode;
    }

    public final List<BeaconRegion> getSiteBeaconRegions() {
        return this.siteBeaconRegions;
    }

    public final String getSiteCountry() {
        return this.siteCountry;
    }

    public final String getSiteCoverPhotoURL() {
        return this.siteCoverPhotoURL;
    }

    public final String getSiteDescription() {
        return this.siteDescription;
    }

    public final String getSiteFullAddress() {
        return this.siteFullAddress;
    }

    public final int getSiteId() {
        return this.siteId;
    }

    public final String getSiteInstructions() {
        return this.siteInstructions;
    }

    public final String getSiteLatitude() {
        return this.siteLatitude;
    }

    public final String getSiteLocality() {
        return this.siteLocality;
    }

    public final String getSiteLongitude() {
        return this.siteLongitude;
    }

    public final String getSiteName() {
        return this.siteName;
    }

    public final String getSiteOperationalStatus() {
        return this.siteOperationalStatus;
    }

    public final String getSitePartnerId() {
        return this.sitePartnerId;
    }

    public final String getSitePhone() {
        return this.sitePhone;
    }

    public final String getSitePostalCode() {
        return this.sitePostalCode;
    }

    public final Integer getSitePrearrivalSeconds() {
        return this.sitePrearrivalSeconds;
    }

    public final String getSiteRegion() {
        return this.siteRegion;
    }

    public final String getSiteStreetAddress() {
        return this.siteStreetAddress;
    }

    public final Double getSiteWrongSiteArrivalRadius() {
        return this.siteWrongSiteArrivalRadius;
    }

    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    public final boolean getSpotIdentifierEntryEnabled() {
        return this.spotIdentifierEntryEnabled;
    }

    public final String getSpotIdentifierInputType() {
        return this.spotIdentifierInputType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean getWrongSiteDetectionEnabled() {
        return this.wrongSiteDetectionEnabled;
    }

    public final Integer getWrongSiteId() {
        return this.wrongSiteId;
    }

    public final Double getWrongSiteSearchRadius() {
        return this.wrongSiteSearchRadius;
    }

    public int hashCode() {
        int iA = a.a(this.orderState, Integer.hashCode(this.id) * 31, 31);
        String str = this.type;
        int iA2 = a.a(this.customerState, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.arrivedAt;
        int iA3 = a.a(this.createdAt, (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.updatedAt;
        int iHashCode = (iA3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redeemedAt;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.redemptionCode;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.etaAt;
        int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.partnerIdentifier;
        int iHashCode5 = (iHashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.partnerIdentifierForCustomer;
        int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.partnerIdentifierForCrew;
        int iHashCode7 = (iHashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.displayName;
        int iHashCode8 = (iHashCode7 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.displayDetail;
        int iHashCode9 = (Integer.hashCode(this.siteId) + ((iHashCode8 + (str11 == null ? 0 : str11.hashCode())) * 31)) * 31;
        String str12 = this.sitePartnerId;
        int iHashCode10 = (iHashCode9 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.siteName;
        int iHashCode11 = (iHashCode10 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.sitePhone;
        int iHashCode12 = (iHashCode11 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.siteStreetAddress;
        int iHashCode13 = (iHashCode12 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.siteFullAddress;
        int iHashCode14 = (iHashCode13 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.siteLocality;
        int iHashCode15 = (iHashCode14 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.siteRegion;
        int iHashCode16 = (iHashCode15 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.siteCountry;
        int iHashCode17 = (iHashCode16 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.sitePostalCode;
        int iHashCode18 = (iHashCode17 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.siteLongitude;
        int iHashCode19 = (iHashCode18 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.siteLatitude;
        int iHashCode20 = (iHashCode19 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.siteInstructions;
        int iHashCode21 = (iHashCode20 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.siteDescription;
        int iHashCode22 = (iHashCode21 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.siteCoverPhotoURL;
        int iHashCode23 = (iHashCode22 + (str25 == null ? 0 : str25.hashCode())) * 31;
        List<BeaconRegion> list = this.siteBeaconRegions;
        int iHashCode24 = (iHashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        Double d10 = this.siteWrongSiteArrivalRadius;
        int iHashCode25 = (iHashCode24 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str26 = this.projectAccentColor;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.projectAccentTextColor;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.projectLogoURL;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.pickupWindow;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.pickupType;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.customerId;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.customerName;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.customerCarType;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.customerCarColor;
        int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.customerLicensePlate;
        int iHashCode35 = (iHashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        Integer num = this.customerRatingValue;
        int iHashCode36 = (iHashCode35 + (num == null ? 0 : num.hashCode())) * 31;
        String str36 = this.customerRatingComments;
        int iHashCode37 = (iHashCode36 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.pushToken;
        int iHashCode38 = (Boolean.hashCode(this.projectMobileFlowRequireVehicleInfoIfVisible) + ((Boolean.hashCode(this.projectMobileFlowPickupTypeSelectionEnabled) + ((Boolean.hashCode(this.projectMobileFlowCustomerNameEditingEnabled) + ((Boolean.hashCode(this.projectMobileFlowAlwaysShowVehicleInfoFields) + ((iHashCode37 + (str37 == null ? 0 : str37.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        String str38 = this.curbsideLocalizedString;
        int iHashCode39 = (iHashCode38 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.pickupLocalizedString;
        int iHashCode40 = (Boolean.hashCode(this.locationTrackingEnabled) + ((iHashCode39 + (str39 == null ? 0 : str39.hashCode())) * 31)) * 31;
        String str40 = this.spotIdentifier;
        int iHashCode41 = (Boolean.hashCode(this.spotIdentifierEntryEnabled) + ((iHashCode40 + (str40 == null ? 0 : str40.hashCode())) * 31)) * 31;
        String str41 = this.spotIdentifierInputType;
        int iHashCode42 = (Boolean.hashCode(this.distanceFilteringDisabled) + ((Boolean.hashCode(this.wrongSiteDetectionEnabled) + ((iHashCode41 + (str41 == null ? 0 : str41.hashCode())) * 31)) * 31)) * 31;
        Double d11 = this.wrongSiteSearchRadius;
        int iHashCode43 = (iHashCode42 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str42 = this.siteOperationalStatus;
        int iHashCode44 = (iHashCode43 + (str42 == null ? 0 : str42.hashCode())) * 31;
        Integer num2 = this.sitePrearrivalSeconds;
        int iHashCode45 = (iHashCode44 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pickupConfigId;
        int iHashCode46 = (iHashCode45 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.wrongSiteId;
        int iHashCode47 = (iHashCode46 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str43 = this.handoffVehicleLocation;
        int iHashCode48 = (iHashCode47 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.estimatedReadyAt;
        int iHashCode49 = (iHashCode48 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.orderFiredAt;
        return iHashCode49 + (str45 != null ? str45.hashCode() : 0);
    }

    public final void setCustomerCarColor(String str) {
        this.customerCarColor = str;
    }

    public final void setCustomerCarType(String str) {
        this.customerCarType = str;
    }

    public final void setCustomerLicensePlate(String str) {
        this.customerLicensePlate = str;
    }

    public final void setCustomerName(String str) {
        this.customerName = str;
    }

    public /* synthetic */ Order(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i11, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, List list, Double d10, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, Integer num, String str39, String str40, boolean z10, boolean z11, boolean z12, boolean z13, String str41, String str42, boolean z14, String str43, boolean z15, String str44, boolean z16, boolean z17, Double d11, String str45, Integer num2, Integer num3, Integer num4, String str46, String str47, String str48, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, i11, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, list, d10, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, num, str39, str40, z10, z11, z12, z13, str41, str42, z14, str43, (i13 & 2097152) != 0 ? true : z15, str44, z16, z17, d11, str45, num2, num3, num4, str46, str47, str48);
    }
}
