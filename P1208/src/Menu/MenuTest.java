package Menu;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("메모장");
		f.setSize(500, 300);

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일");
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("열기");

		Menu mOthers = new Menu("확대/축소");
		MenuItem miExit = new MenuItem("Exit");

		mFile.add("새항목");
		mFile.add("새 창");
		mFile.add("열기");
		mFile.add("저장");
		mFile.add("다른이름으로 저장");
		mFile.add("페이지 설정");
		mFile.add("인쇄");
		mFile.add("저장");

		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
		MenuItem miView = new MenuItem("확대");
		mOthers.add(miView);
		 
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		

		Menu mEdit = new Menu("편집");
		Menu mView = new Menu("보기");

		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("확대/축소");
		mView.add("확대/축소");
		mView.add("상태표시줄");
		mView.add("자동 줄 바꿈");

		mEdit.add("실행취소");
		mEdit.add("잘라내기");
		mEdit.add("복사");
		mEdit.add("붙여넣기");
		mEdit.add("삭제");
		mEdit.add("찾기");
		mEdit.add("다음찾기");
		mEdit.add("이전찾기");
		mEdit.add("바꾸기");
		mEdit.add("이동");
		mEdit.add("모두선택");
		mEdit.add("시간/날짜");
		mEdit.add("글꼴");

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.add(mOthers);
		mView.add(mOthers);
		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
