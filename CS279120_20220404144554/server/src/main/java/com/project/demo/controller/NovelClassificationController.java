package com.project.demo.controller;

import com.project.demo.entity.NovelClassification;
import com.project.demo.service.NovelClassificationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *小说分类：(NovelClassification)表控制层
 *
 */
@RestController
@RequestMapping("/novel_classification")
public class NovelClassificationController extends BaseController<NovelClassification,NovelClassificationService> {

    /**
     *小说分类对象
     */
    @Autowired
    public NovelClassificationController(NovelClassificationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
