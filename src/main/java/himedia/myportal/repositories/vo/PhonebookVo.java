package himedia.myportal.repositories.vo;

public class PhonebookVo {

	private Long id;
	private String name; // Reference to user.name
	private String hp ;
	private String tel ;
	
	// Constructors
    public PhonebookVo() {
        // Default constructor
    }

	public PhonebookVo(Long id, String name, String hp, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTp() {
		return tel;
	}

	public void setTp(String tp) {
		this.tel = tp;
	}

	@Override
	public String toString() {
		return "PhonebookVo [id=" + id + ", name=" + name + ", hp=" + hp + ", tel=" + tel + "]";
	}

	
	
	
	
	
	
	
}
