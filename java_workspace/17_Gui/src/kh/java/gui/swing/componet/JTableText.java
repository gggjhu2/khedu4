package kh.java.gui.swing.componet;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import kh.java.gui.util.MyUtil;



//
//	JTable(TableModel)
//	-TableModel 데이터가 저장되는 객체, 이벤트핸들링
//JScrollPane(JTabl)을추가
//	-헤더부 노출 , 스크롤기능 이용
//
public class JTableText extends JFrame {
	
	List<Member> list =new ArrayList<>();
	{
		list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));	list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));list.add(new Member("홍길동","서울",24,false));
		list.add(new Member("신사임당","부산",48,false));
		list.add(new Member("세종","서울",67,false));
	}
	
	
	
	public JTableText(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//컬럼정보
		Object[] columnNames = {
				"이름", "주소","나이","결혼여부"
		};
		
		
		//행정보(실제데이타 data)
//		Object[][]rowData = {
//				{"홍길동","서울",24,false},
//				{"신사임당","부산",48,false},
//				{"세종","서울",67,false}
//		};
//		
		Object[][] rowData=new Object[list.size()][columnNames.length];
		for(int i =0 ; i <list.size();i++) {
			Member m =list.get(i);
			rowData[i][0]=m.getName();
			rowData[i][1]=m.getAddr();
			rowData[i][2]=m.getAge();
			rowData[i][3]=m.isMarried();
			
			
		}
		
		
		//테이블 생성
		JTable table =new JTable(rowData,columnNames);
		
		//헤더 클릭시 정렬기능
		table.setAutoCreateRowSorter(true);
		
		
		//viewport지정 (스크롤시 맨처음어딜보여줄지지정해주느것이다)
		table.setPreferredScrollableViewportSize(new Dimension(500,100));
		//스크롤 페인 에 추가
		JScrollPane scrollPane =new JScrollPane(table);
		
		//셀편집시 이벤트처리하기
		TableModel model =table.getModel();
		model.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				//몇행 몇열이 변경되었는지알아내야된다.	
				int row =e.getFirstRow();
				int col =e.getColumn();
				//변경이나 수정된 좌표를가져온다.
				System.out.println(row+", "+col);
				
				//데이터를 가져온다.
				Object data =model.getValueAt(row, col);
				System.out.println(data);
			}
		});
	
	

	
	//하단 저장버튼 추가
		JButton btn = new JButton("저장");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int rowLen =model.getRowCount();
				int colLen =model.getColumnCount();
				
				List<Member> newList =new ArrayList<>();
				 for (int i =0 ; i <rowLen ; i++) {
					 
					 Member newMember =new Member();
					 
					 for(int j=0 ; j<colLen; j++) {
						 Object data =model.getValueAt(i,j);
//						 System.out.println(data);
						 switch(j) {
						 case 0: newMember.setName((String)data); break;
						 case 1: newMember.setAddr((String)data); break;
						 						//정수형변환시에는 인티저쩜파스인트해줘야한다 정수형변환만 특이하다==>에러가나서 다시정정
///						 case 2: newMember.setAge(Integer.parseInt((String)data)); break;
						 case 2: newMember.setAge(Integer.parseInt(data.toString())); break;
						 case 3: newMember.setMarried((boolean)data); break;
						 }
					 }
					 //스위치문이끝나면
					 newList.add(newMember);
				 }
				 
				 //잘가져왔는지 2중포문끝에 확인 출력메세지를작성해본다
				 for(Member newMember : newList) {
					 System.out.println(newMember);
				 }
			
			
			}
		});
		
		add(scrollPane);
		add(btn, BorderLayout.SOUTH);
		pack();
		
		
	
	}
	public static void main(String[] args) {
		new JTableText(500,200,"JTable").setVisible(true);
	}

}
